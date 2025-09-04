class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length];
		for(int a[]:dp) Arrays.fill(a, -1);
        return solve(coins,amount,0,dp);
    }
	public static int solve(int [] coin, int amt, int i, int[][] dp) {
		if(amt==0) return 1;
		if(i==coin.length) return 0;
		if(dp[amt][i]!=-1) return dp[amt][i];
		int inc=0;
		int exc=0;
		if(amt>=coin[i]) inc=solve(coin,amt-coin[i],i,dp);
		exc=solve(coin,amt,i+1,dp);
		return dp[amt][i]=inc+exc;
	}
}