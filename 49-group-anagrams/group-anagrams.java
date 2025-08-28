class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String, List<String>>hm=new HashMap<>();
     for(int i=0;i<strs.length;i++){
        String s=strs[i];
        int a[]=new int[26];
        for(int j=0;j<s.length();j++){
            a[s.charAt(j)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int num:a){
            sb.append(num).append('#');
        }
        String key=sb.toString();
        if(!hm.containsKey(key)){
            hm.put(key,new ArrayList<>());
        }
        hm.get(key).add(s);
        
     }   
     return new ArrayList<>(hm.values());
    }
}