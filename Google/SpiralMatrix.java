class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> op = new ArrayList<Integer>();
        if(matrix.length == 0) {
            return op;
        }
        int  m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int c = 0;
        while (true) {
            
            for (int i = l, j = l; j < n-l; j++) {
                op.add(matrix[i][j]);
                c++;
                if (c >= m*n) {
                    return op;
                }
            }
            for (int i = l+1, j = n-l-1; i < m-l; i++) {
                op.add(matrix[i][j]);
                c++;
                if (c >= m*n) {
                    return op;
                }
            }
            for (int i = m-l-1, j = n-l-2; j >= l; j--) {
                op.add(matrix[i][j]);
                c++;
                if (c >= m*n) {
                    return op;
                }
            }
            for (int i = m-l-2, j = l; i > l; i-- ) {
                op.add(matrix[i][j]);
                c++;
                if (c >= m*n) {
                    return op;
                }
            }
            l++;
        }
    }
}