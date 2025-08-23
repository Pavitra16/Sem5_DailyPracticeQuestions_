class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones) pq.add(i);
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            if(x-y>0) pq.add(x-y);
        }
        if(pq.size()==0) return 0;
        return pq.remove();
    }
}