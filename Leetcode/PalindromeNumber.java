class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x < 0) {
            return false;
        }
        int r = 0;
        while(x > 0) {
            int d = x % 10;
            r = r*10 + d;
            x = x/10;
        }
        System.out.println(r);
        if(r==temp) {
            return true;
        }
        return false;
    }
}