class Solution {
    public int arraySign(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==0) return 0;
            if(n<0) nums[i]=-1;
            else nums[i]=1;
        }
        int prod=1;
        for(int i:nums) prod*=i;
        return prod;
    }
}