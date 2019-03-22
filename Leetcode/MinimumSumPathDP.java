class MinimumSumPathDP {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] op = new int[m][n];
        
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (i == m-1 && j != n-1) {
                    op[i][j] = grid[i][j] + op[i][j+1];
                }
                else if (i != m-1 && j == n-1) {
                    op[i][j] = grid[i][j] + op[i+1][j];
                }
                else if (i == m-1 && j == n-1) {
                    op[i][j] = grid[i][j];
                }
                else{
                    op[i][j] = grid[i][j] + Math.min(op[i+1][j] , op[i][j+1]);
                }
            }
        }
        return op[0][0];
    }
}