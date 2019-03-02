class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] op = new int[m][n];

        if(obstacleGrid[m-1][n-1] == 1) {
            op[m-1][n-1] = 0; 
        }
        else{
            op[m-1][n-1] = 1; 
        }
        for(int i = n-2; i >= 0; i--) {
            if(obstacleGrid[m-1][i] == 1) {
                op[m-1][i] = 0;
            } else {
                op[m-1][i] = op[m-1][i+1];
            }
        }
        for(int i = m-2; i >= 0; i--) {
            if(obstacleGrid[i][n-1] == 1) {
                op[i][n-1] = 0;
            } else {
                op[i][n-1] = op[i+1][n-1];
            }
        }
        
        for(int i = m-2; i >= 0; i--) {
            for(int j = n-2; j >= 0; j--) {
                if(obstacleGrid[i][j] == 1) {
                    op[i][j] = 0;
                }
                else{
                    op[i][j] = op[i][j+1] + op[i+1][j];
                }
            }
        }
        return op[0][0];
    }
}