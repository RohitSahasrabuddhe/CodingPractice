class Solution {
    public int climbStairs(int n) {
        if(n <= 0){
            return -1;
        }
        if(n == 1){
            return 1;
        }
        int[] op = new int[n];
        op[n-1] = 1;
        op[n-2] = 2;
        
        for(int i = n-3; i >= 0; i--){
            op[i] = op[i+1] + op[i+2];
        }
        return op[0];
    }
}