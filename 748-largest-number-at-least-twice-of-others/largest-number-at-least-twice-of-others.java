class Solution {
    public int dominantIndex(int[] nums) {
        int ind=-1;
        int ele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>ele){
                ele=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==ind) continue;
            if(nums[i]*2 > ele) return -1;
        }
        return ind;
    }
}