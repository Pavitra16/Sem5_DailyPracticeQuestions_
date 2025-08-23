class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer>odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>even=new PriorityQueue<>(Collections.reverseOrder());
        int num1=num;
        while(num1!=0){
            int dig=num1%10;
            num1/=10;
            if(dig%2==0) even.add(dig);
            else odd.add(dig);
        }
        String n=""+num;
        int ans=0;
        for(int i=0;i<n.length();i++){
            int ele=n.charAt(i)-'0';
            int dig=0;
            if(ele%2==0){
                dig=even.remove();
            }
            else dig=odd.remove();
            ans=ans*10 + dig;

        }
        return ans;

    }
}