class Solution {
    public int findKthLargest(int[] nums, int k) {
        return solve(nums,k);
    }
    	public  int solve(int a[], int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) pq.add(a[i]);
		for(int i=k;i<a.length;i++){
			if(a[i]>pq.peek()) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		return pq.peek();
	}
}