class PalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++) {
            int l1 = expandAroundCenter(s, i, i);
            int l2 = expandAroundCenter(s, i, i+1);
            int l = Math.max(l1,l2);
            
            if(max < l) {
                start = i - (l-1)/2;
                end = i + l/2;
                max = l;
                index = i;
            }
           
        }
        return s.substring(start,end+1);
    }
    
    private int expandAroundCenter(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}