class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        
        for(String s : strs){
            String hash = getHash(s);
            if(map.containsKey(hash)){
                map.get(hash).add(s);
            } else{
                List<String> set = new ArrayList<String>();
                set.add(s);
                map.put(hash, set);
            }
        }
        
        List<List<String>> op = new ArrayList<List<String>>();
        
        for(Map.Entry<String, List<String>> e :map.entrySet()){
            List<String> s = e.getValue();        
            op.add(s);
        }
        return op;
    }
    
    
    public String getHash(String str){
        int[] count = new int[26];
        for(char c: str.toCharArray()){
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < 26; i++){
            sb.append(count[i]);
        }
        return sb.toString();
    }
}