package sliding_window;

public class kartikBhaiya_and_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabababbabaaaaaaabba";
		int k=3;
		
		int flip_a=flipChar(s,k,'a');
		int flip_b=flipChar(s,k,'b');
		int ans=Math.max(flip_a, flip_b);
		System.out.println(ans);
		

	}
	public static int flipChar(String s, int k, char ch) {
		int flip=0;
		int si=0;
		int ei=0;
		int ans=0;
		while(ei<s.length()) {
			//grow
			if(s.charAt(ei)==ch)flip++;
			while(flip>k && si<=ei) {
				if(s.charAt(si)==ch) flip--;
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
