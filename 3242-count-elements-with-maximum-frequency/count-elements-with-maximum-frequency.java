class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            if(!hm.containsKey(i)) hm.put(i,1);
            else{
                int count=hm.get(i);
                hm.put(i,count+1);
            }
        }
        int max=0;
        for(int i:hm.values()) max=Math.max(max,i);
        int count=0;
        for(int i:hm.values()){
           if(i==max) count+=max;
        }
        return count;
    }
}