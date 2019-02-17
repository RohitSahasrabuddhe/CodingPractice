



 // Complete the count_palindromes function below.
    public static int count = 0;
    static int count_palindromes(String s) {
       
        if (s == null || s.length() == 0 ) {
            return 0;
        }
        
        for (int i = 0 ; i < s.length(); i++) {
            checkPalindrome(s,i,i);
            checkPalindrome(s,i,i+1);
        }
        return count;

    }

    private static void checkPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
    }



