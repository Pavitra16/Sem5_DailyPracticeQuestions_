package sliding_window;

import java.util.Scanner;

public class SubarrayProductLessThan_k_Leetcode713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int k=sc.nextInt();
		int ans=count(a,k);
		System.out.println(ans);

	}
    public static int count(int a[], int k){
        int si=0;
        int ei=0;
        int prod=1;
        int ans=0;
        while(ei<a.length){
            //grow
            prod*=a[ei];
            //shrink(if prod>=k)
            while(prod>=k && si<=ei) {
                prod/=a[si];
                si++;
            }
            
            //ans
            ans+=(ei-si+1);
            ei++;
        }
        return ans;
    }

}
