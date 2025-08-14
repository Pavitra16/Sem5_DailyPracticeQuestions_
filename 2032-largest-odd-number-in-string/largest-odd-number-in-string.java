class Solution {
    public String largestOddNumber(String num) {
        int ind=-1;
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            int n=(int)ch-'0';
            if(n%2!=0){
                return num.substring(0,i+1);
            }
        }
        String ans="";
        return ans;
    }
}