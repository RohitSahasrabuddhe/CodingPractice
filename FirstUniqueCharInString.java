class FirstUniqueCharInString {
    public int firstUniqChar(String s) {
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
}