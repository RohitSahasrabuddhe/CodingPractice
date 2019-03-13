class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] inp = s.toCharArray();
        
        for(char c : inp) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int index = 0;
        for(char c : inp) {
            if(map.get(c) == 1) {
                return index;
            }
            index++;  
        }
        return -1;
        
    }
}