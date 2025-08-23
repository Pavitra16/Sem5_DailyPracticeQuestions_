class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:amount){
            if(i>0)pq.add(i);
        } 
        int ans=0;
        while(pq.size()>1) {
            int a=pq.remove();
            int b=pq.remove();
            if(a-1>0) pq.add(a-1);
            if(b-1>0) pq.add(b-1);
            ans++;
        }
        if(pq.size()==1) ans+=pq.remove();
        return ans;
    }
}