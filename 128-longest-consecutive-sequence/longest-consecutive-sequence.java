class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums) hs.add(i);
        return solve(hs,nums);

    }
    public int solve(HashSet<Integer>hs, int[]nums){
        int ans=0;
        for(int i:nums){
            if(!(hs.contains(i-1))){
                int c=0;
                int key=i;
                while(hs.contains(key)){
                    hs.remove(key);
                    c++;
                    key++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}