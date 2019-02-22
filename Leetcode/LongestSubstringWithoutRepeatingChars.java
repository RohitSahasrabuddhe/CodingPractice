class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<Character>();
        int max = 0;
        while (l < s.length() && r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                max = Math.max(max,r-l+1);
                r++;
            }
            else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}