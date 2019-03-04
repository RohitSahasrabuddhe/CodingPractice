class Solution {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] op = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int  j = 0; j < n; j++) {
                int val = getValue(M, i, j, m, n);
                op[i][j] = val;
            }
        }
        return op;
    }
    
    public int getValue(int[][] M, int i, int j, int m, int n) {
        int c = 0;
        int sum = 0;
        if(i-1 >= 0 && j-1 >= 0) {
            sum+= M[i-1][j-1];
            c++;
        }
        if(i-1 >= 0) {
            sum+= M[i-1][j];
            c++;
        }
        if(i-1 >= 0 && j+1 < n) {
            sum+= M[i-1][j+1];
            c++;
        }
        if(j-1 >= 0) {
            sum+= M[i][j-1];
            c++;
        }
        if(i+1 < m && j-1 >= 0) {
            sum+= M[i+1][j-1];
            c++;
        }
        if(i+1 < m) {
            sum+= M[i+1][j];
            c++;
        }
        if(j+1 < n) {
            sum+= M[i][j+1];
            c++;
        }
        if(i+1 < m &&j+1 < n) {
            sum+= M[i+1][j+1];
            c++;
        }
        return Math.floor(sum/c);    
    }
}