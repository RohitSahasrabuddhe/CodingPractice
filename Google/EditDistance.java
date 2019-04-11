class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        int[][] op = new int[n+1][m+1];
        
        for(int i = 0; i <= n; i++){
            op[i][0] = i;
        }
        for(int i = 0; i <= m; i++){
            op[0][i] = i;
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    op[i][j] = 1 + Math.min(Math.min(op[i-1][j], op[i][j-1]), op[i-1][j-1] -1);
                } else{
                    op[i][j] = 1 + Math.min(Math.min(op[i-1][j], op[i][j-1]), op[i-1][j-1]);
                }
            }
        }
        return op[n][m];
    }
}