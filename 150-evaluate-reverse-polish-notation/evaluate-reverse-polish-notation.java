class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String i:tokens){
            if(i.equals("+")){
                int sum=st.pop()+st.pop();
                st.push(sum);
            }
            else if(i.equals("*")){
                int prod=st.pop()*st.pop();
                st.push(prod);
            }
            else if(i.equals("-")){
                int n2=st.pop();
                int n1=st.pop();
                st.push(n1-n2);
            }
            else if(i.equals("/")){
                int n2=st.pop();
                int n1=st.pop();
                st.push(n1/n2);
            }
            else st.push(Integer.parseInt(i));
        }
        return st.pop();
    }
}