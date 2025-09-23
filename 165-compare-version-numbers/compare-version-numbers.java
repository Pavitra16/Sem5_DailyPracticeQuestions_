class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\.");
        String [] s2=version2.split("\\.");
        for(int i=0;i<s1.length;i++) System.out.println(s1[i]);
        for(int i=0;i<s2.length;i++) System.out.println(s2[i]);
        int i=0;
        int j=0;
        while(i<s1.length && j<s2.length){
            int n1=Integer.parseInt(s1[i]);
            int n2=Integer.parseInt(s2[j]);
            if(n1<n2) return -1;
            if(n2<n1) return 1;
            i++;
            j++;
        }
        while(i<s1.length){
            int n=Integer.parseInt(s1[i]);
            if(n>0) return 1;
            i++;
        }
        while(j<s2.length){
            int n=Integer.parseInt(s2[j]);
            if(n>0) return -1;
            j++;
        }
        return 0;
    }
}