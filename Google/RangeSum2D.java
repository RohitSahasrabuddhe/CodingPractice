class NumMatrix {
    int[][] mat;
    int n;
    int m;
    public NumMatrix(int[][] matrix) {
        if (matrix.length > 0) {
            mat = new int[matrix.length][matrix[0].length];
            n = matrix.length;
            m = matrix[0].length;
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = matrix[i][j];
                }
            }
        }
        
    }
    
    public void update(int row, int col, int val) {
        if(mat != null) {
            mat[row][col] = val;
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(mat == null) {
            return 0;
        }
        int sum = 0;
        for(int i = row1; i <= row2; i++) {
            for(int j = col1; j <= col2; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}