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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=solve(root);
        if(c==-1) camera++;
        return camera;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        if(left==-1 || right==-1){ //-1-- camera is needed at this node
            camera++;
            return 1;//camera has been set up at this node
        }
        //inme se kisi ek ke pass ya dono ke pass camera hai or ek ke pass camera hai and the other one is covered
        else if(left==1 || right==1) return 0;
        //both the chidren are covered but node needs camera
        else return -1;//need a camera
        //


    
    }
}