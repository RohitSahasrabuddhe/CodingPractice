class FirstUniqueCharInString {
    public int firstUniqCharNaive(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = 0;
            for (j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (c == s.charAt(j)) {
                    break;
                }
            }
            if (j == s.length()) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        boolean[] flags = new boolean[26];
        int[] vals = new int[26];
        
        Set<Character> set = new HashSet<Character>();
        for (int i =0; i < s.length(); i++) {
            if (flags[(int)(s.charAt(i) - 97)] == true) {
                continue;
            }
            
            if (set.contains(s.charAt(i))) {
                flags[(int)(s.charAt(i) - 97)] = true;
            }
            else{
                set.add(s.charAt(i));
                vals[(int)(s.charAt(i) - 97)] = i;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (flags[(int)(s.charAt(i) - 97)] == false) {
                return vals[(int)(s.charAt(i) - 97)];
            }
        }
        return -1;
    }
}