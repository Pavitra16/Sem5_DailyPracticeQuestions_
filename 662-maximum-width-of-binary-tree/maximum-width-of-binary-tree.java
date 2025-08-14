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
    class pair{
        TreeNode node;
        int ind;
        public pair(TreeNode node, int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair>q=new LinkedList<>();
        int width=0;
        pair p1=new pair(root,0);
        q.add(p1);
        int st=0;
        int ed=0;
        while(!q.isEmpty()){
            pair start=q.peek();
            pair end=null;
            int s=q.size();
            for(int i=0;i<s;i++){
                end=q.poll();
                if(end.node.left!=null) q.add(new pair(end.node.left,2*(end.ind)+1));
                if(end.node.right!=null) q.add(new pair(end.node.right,2*(end.ind)+2));
                
            }
            width=Math.max(width,end.ind-start.ind+1);
        }
        return width;
    }
}