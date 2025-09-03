class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        //return robber2(nums,nums.length-1,dp);
        return robber3(nums);
    }
    	public int robber2(int[] a, int i, int[] dp) {
		if(i<0) return 0;
		 
		if(dp[i]!=-1) { return dp[i];}
		int rob=a[i]+robber2(a,i-2,dp);
		int dont_rob=robber2(a,i-1,dp);
		return dp[i]=Math.max(rob, dont_rob);
		
	}
    	public static int robber3(int a[]) {
		if(a.length==1) return a[0];
		int dp[]=new int[a.length];
		dp[0]=a[0];
		dp[1]=Math.max(a[0], a[1]);
		for(int i=2;i<dp.length;i++) {
			int rob=a[i]+dp[i-2];
			int dont=dp[i-1];
			dp[i]=Math.max(rob, dont);
		}
		return dp[dp.length-1];
		
	}
}