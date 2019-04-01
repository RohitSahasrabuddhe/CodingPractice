public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int op = 0;
        
        while( n != 0){
            op++;
            n = n & (n-1);
        }
        return op;
    }
}