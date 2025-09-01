class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int []>pq = new PriorityQueue<>(
            (a,b)->Double.compare(
                gain(b[0],b[1]),
                gain(a[0],a[1])
            )
        );

        for(int c[] : classes){
            pq.add(new int[] {c[0],c[1]});
        }

        while (extraStudents>0){
            int c[] = pq.poll();
            int pass = c[0];
            int total = c[1];
            pq.add(new int[] {pass+1,total+1});
            extraStudents--;
        }
        double ans = 0.0;
        while(!pq.isEmpty()){
            int arr[] = pq.poll();
            ans+=(double)arr[0]/arr[1];
        }

        return ans/classes.length;
    }

    public double gain(int pass, int total){
        return (double)(pass+1)/(total+1) - (double)pass/total;
    }
}