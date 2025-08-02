package sliding_window;
import java.util.*;
public class max_subarray_sum_of_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int k=sc.nextInt();
		int sum=maxSum(a,k);
		System.out.println(sum);
		
		
	}
	public static int maxSum(int a[], int k) {
		int sum=0;
		int ans=0;
		for(int i=0;i<k;i++) sum+=a[i];
		ans=sum;
		for(int i=k;i<a.length;i++) {
			sum+=a[i];
			sum-=a[i-k];
			ans=Math.max(sum, ans);
		}
		return ans;
	}

}
