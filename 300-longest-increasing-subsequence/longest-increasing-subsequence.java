class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
    }
    	public static int LIS(int a[]) {
		int dp[]=new int[a.length];
		Arrays.fill(dp, 1);
		for(int i=1;i<dp.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(a[i]>a[j]) {
					int x=dp[j];
					dp[i]=Math.max(dp[i], x+1);
				}
			}
		}
		return Arrays.stream(dp).max().getAsInt();
	}
}