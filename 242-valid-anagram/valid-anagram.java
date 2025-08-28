class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        if(t.length()!=s.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int count=hm.get(s.charAt(i))+1;
                hm.put(s.charAt(i),count);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                int count=hm.get(t.charAt(i))-1;
                if(count==0){
                    hm.remove(t.charAt(i));
                }
                else{
                     hm.put(t.charAt(i),count);
                }
               
            }
        }
        if(hm.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}