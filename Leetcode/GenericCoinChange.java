class Solution {
    public int coinChange(int[] coins, int amount) {
        int cns = coins.length;
        int[][] op = new int[cns][amount+1];
        
        // Initialize the DP problem
        for(int i = 0; i <= amount; i++){
            op[0][i] = i;
        }
        
        for(int i = 1; i < cns; i++){
            for(int j = 0; j <= amount; j++){
                if(j >= coins[i]){                   
                    op[i][j] = Math.min((op[i][j-coins[i]] + 1), (op[i-1][j]));
                } else{
                    op[i][j] = op[i-1][j];
                }
            }
        }
        return op[cns-1][amount];
    }       
}