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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
    public TreeNode insert(TreeNode root, int key){
        if(root==null) return new TreeNode(key);
        if(key>root.val) root.right=insert(root.right,key);
        if(key<root.val) root.left=insert(root.left,key);
        return root;
    }
}