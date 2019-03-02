class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] op = new int[m][n];
        int c = 0;
        int k = 0;
        while (c < m){
            op[c][n-1] = 1;
            c++;
        }
        while (k < n){
            op[m-1][k] = 1;
            k++;
        }
        
        for(int  i = m-2; i >= 0; i--) {
            for(int j = n-2; j >= 0; j--) {
                op[i][j] = op[i+1][j] + op[i][j+1];
            }
        }
        return op[0][0];
    }
}