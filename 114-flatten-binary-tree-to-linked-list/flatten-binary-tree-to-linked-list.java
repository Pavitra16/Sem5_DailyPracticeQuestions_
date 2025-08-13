/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        create(root);
    }
    public TreeNode create(TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        TreeNode left_tail=create(root.left);
        TreeNode right_tail=create(root.right);
        if(root.left!=null){//root.left is head of left linked list
            left_tail.right=root.right;
            root.right=root.left;
            root.left=null;

        }
        return right_tail!=null ? right_tail : left_tail;
    }
}