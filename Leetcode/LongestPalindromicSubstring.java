class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        
        //System.out.println(isPalindrome(s,1,3));
        
        for (int pLen = s.length(); pLen > 0; pLen--) {
            
            for (int i = 0; i+pLen <= s.length(); i++) {
                if (isPalindrome(s,i,i+pLen-1)) {
                    //System.out.println("True For:" + s.substring(i,i+pLen));
                    return s.substring(i,i+pLen);
                }
                else {
                    //System.out.println("False for: " + pLen);
                }
            }
            
        }
        
        
        return "";
    }
    
    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}