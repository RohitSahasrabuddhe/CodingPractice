class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[256];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (count[t.charAt(i)]-- <= 0) {
                return false;
            }
            
        }
        return true;
    }
}