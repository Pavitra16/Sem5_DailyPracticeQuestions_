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
    class bstpair{
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
            boolean isbst=true;
        }

    public boolean isValidBST(TreeNode root) {
        return valid(root).isbst;

    }
    public bstpair valid(TreeNode root){
        if(root==null) return new bstpair();
        bstpair lbp=valid(root.left);
        bstpair rbp=valid(root.right);
        bstpair sbp=new bstpair();
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max=Math.max(rbp.max,Math.max(rbp.max,root.val));
        sbp.isbst=lbp.isbst && rbp.isbst && (root.val>lbp.max && root.val<rbp.min);
        return sbp;
    }
}