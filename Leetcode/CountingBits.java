class CountingBits {
    public int[] countBits(int num) {
        int[] output = new int[num+1];
        if (num >= 0) {
            output[0] = 0;
        }
        
        for (int i = 0; i <= num; i++) {
            output[i] = output[i/2] + i%2;
        }
        return output;
    }
}

class Solution {
    public int[] countBits(int num) {
        int[] op = new int[num+1];
        
        for(int i = 0; i <= num; i++){
            op[i] = getOnes(i);
        }
        return op;
    }
    
    public int getOnes(int n){
        int sum = 0;
        
        while(n > 0){
            sum++;
            n = n & (n-1);
        }
        return sum;
    }
}