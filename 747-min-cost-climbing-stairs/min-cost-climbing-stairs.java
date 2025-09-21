class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        int zero=solve(cost,0,dp);
        int one=solve(cost,1,dp);
        return Math.min(zero,one);
    }
    public int solve(int a[], int i, int dp[]){
        if(i>=a.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one=a[i]+solve(a,i+1,dp);
        int two=a[i]+solve(a,i+2,dp);
        return dp[i]=Math.min(one,two);
    }
}