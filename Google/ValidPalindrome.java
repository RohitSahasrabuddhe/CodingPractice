class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String op = s.toLowerCase();
        op = op.replace(" ","");
        op = op.replaceAll("[^a-zA-Z0-9]","");
        return isPalindromeA(op);
    }
    
    public boolean isPalindromeA(String s) {
        int l = 0;
        int r = s.length()-1;
        
        while(l<r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}