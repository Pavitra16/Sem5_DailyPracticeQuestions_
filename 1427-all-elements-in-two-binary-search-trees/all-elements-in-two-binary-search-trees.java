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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>lst1=new ArrayList<>();
        List<Integer>lst2=new ArrayList<>();
        solve(root1,lst1);
        solve(root2,lst2);
        List<Integer>ans=new ArrayList<>();
        merge(lst1,lst2,ans);
        return ans;
    }
    public void solve(TreeNode root,List<Integer>lst){
        if(root==null) return;
        solve(root.left,lst);
        lst.add(root.val);
        solve(root.right,lst);
    }
    public void merge(List<Integer>lst1, List<Integer>lst2, List<Integer>ans){
        int i=0;
        int j=0;
        while(i<lst1.size() && j<lst2.size()){
            int e1=lst1.get(i);
            int e2=lst2.get(j);
            if(e1<e2){
                ans.add(e1);
                i++;
            }
            else if(e2<e1){
                ans.add(e2);
                j++;
            }
            else {
                ans.add(e1);
                ans.add(e2);
                i++;
                j++;
            }
        }
        while(i<lst1.size()){
            ans.add(lst1.get(i));
            i++;
        }
        while(j<lst2.size()){
            ans.add(lst2.get(j));
            j++;
        }
    }

}