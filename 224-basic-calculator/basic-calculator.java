class Solution {
    public int calculate(String s) {
        int res=0;
        int sign=1;
        int num=0;
        Stack<Integer>st=new Stack<>();
        char a[]=s.toCharArray();
        for(char ch:a){
            if(Character.isDigit(ch)){
                num=num*10 + (ch-'0');
            }
            else if(ch == '+'){
                res+=num*sign;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                res+=num*sign;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
            }
            else if(ch==')'){
                res+=num*sign;
                num=0;
                res*=st.pop();
                res+=st.pop();
            }
        }
        return res + num *sign;
    }
}