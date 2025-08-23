class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int ans=0;
        while(pq.size()>1){
            int n1=pq.remove()-1;
            int n2=pq.remove()-1;
            if(n1>0) pq.add(n1);
            if(n2>0) pq.add(n2);
            ans++;
        }
        return ans;
    }
}