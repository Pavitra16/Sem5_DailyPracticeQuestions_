class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        Set<Integer>st=new HashSet<>();
        int ind=0;
        int diag=Integer.MIN_VALUE;
        for(int i=0;i<dimensions.length;i++){
            int len=dimensions[i][0];
            int wid=dimensions[i][1];
            int cal=len*len + wid*wid;
            
            if(cal>diag){
               st.clear();
               diag=cal;
                st.add(i);
            }
            else if(cal==diag) st.add(i);
            
        }
        int ans=Integer.MIN_VALUE;
        for(int i:st){
            int area=dimensions[i][0]*dimensions[i][1];
            ans=Math.max(ans,area);
        }
        return ans;

    }
}