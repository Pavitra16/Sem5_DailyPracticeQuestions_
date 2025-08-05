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
    public boolean isValidBST(TreeNode root) {
        return check(root).bst;
    }
    public bstpair check(TreeNode root){
        if(root==null) return new bstpair();
        bstpair lbp=check(root.left);
        bstpair rbp=check(root.right);
        bstpair sbp=new bstpair();
        sbp.max=Math.max(lbp.max, Math.max(rbp.max,root.val));
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.bst= lbp.bst && rbp.bst && root.val>lbp.max && root.val<rbp.min;
        return sbp;
    }
    class bstpair{
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        boolean bst=true;
    }
}