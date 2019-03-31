class Solution {
    public int countSubstrings(String s) {
        int op = 0;
        for(int i = 0; i < s.length(); i++){
            op += getPalindrome(s, i, i);
            op += getPalindrome(s, i, i+1);
            
            
        }        
        return op;
        
    }    
    public int getPalindrome(String s, int i, int j){
        int op = 0;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
            op++;
        }
        
        return op;
    }
}