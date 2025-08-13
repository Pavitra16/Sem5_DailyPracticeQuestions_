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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(inorder,preorder,0,inorder.length-1,0,preorder.length-1);
    }
    public TreeNode create(int in[], int [] pre, int ilo, int ihi, int plo, int phi){
       if(ilo>ihi || plo>phi) return null;
        TreeNode node=new TreeNode(pre[plo]);
        int idx=search(in,ilo,ihi,pre[plo]);
        int c=idx-ilo;
        node.left=create(in,pre,ilo,idx-1,plo+1,plo+c);
        node.right=create(in,pre,idx+1,ihi,plo+c+1,phi);
        return node;

    }
    public int search(int a[], int si, int ei, int ele){
        for(int i=si;i<=ei;i++){
            if(a[i]==ele) return i;
        }
        return -1;//to satisfy the condition of function...it's not required acc to the logic
    }
    
}