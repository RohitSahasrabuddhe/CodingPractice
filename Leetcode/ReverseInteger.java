class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            x *= -1;
            flag = true;
        }
            
        long op = 0;
        while(x > 0) {
            int digit = x%10;
            op = op*10 + digit;
            if(op > Integer.MAX_VALUE) {
                return 0;
            }
            x = x/10;
        }
        if(flag) {
            return  (int) op * -1;
        }
        return (int)op;
    }
}