class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return robber2(nums,nums.length-1,dp);
    }
    	public int robber2(int[] a, int i, int[] dp) {
		if(i<0) return 0;
		 
		if(dp[i]!=-1) { return dp[i];}
		int rob=a[i]+robber2(a,i-2,dp);
		int dont_rob=robber2(a,i-1,dp);
		return dp[i]=Math.max(rob, dont_rob);
		
	}
}