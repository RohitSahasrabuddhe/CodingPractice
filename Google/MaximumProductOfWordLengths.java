class Solution {
    public int maxProduct(String[] words) {
        List<Set<Character>> listWords = new ArrayList<Set<Character>>();
        for(String str : words) {
            Set<Character> s = new HashSet<Character>();
            char[] arr = str.toCharArray();
            for(char c : arr) {
                if(!s.contains(c)) {
                    s.add(c);
                }
            }
            listWords.add(s);
        }
        int op = 0;
        
        for(int i = 0; i < words.length; i++) {
            outer: for(int j = i+1; j < words.length; j++) {
                // check ith String with jth set
                char[] arr = words[i].toCharArray();
                
                for(char c : arr) {
                    if(listWords.get(j).contains(c)){
                        continue outer;
                    }
                }
                op = Math.max(op, words[i].length() * words[j].length());
                
            }
        }
        return op;
    }
}