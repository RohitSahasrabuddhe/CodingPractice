class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] op = new int[length];
        
        for(int[] u : updates){
            op[u[0]] += u[2];
            if(u[1] < length-1){
                op[u[1]+1] += - u[2];
            }
        }
        
        for(int i = 1; i < length; i++){
            op[i] = op[i]+op[i-1];
        }
        return op;
    }
}