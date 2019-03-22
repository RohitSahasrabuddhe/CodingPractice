class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        
        int i = n-1;
        int j = 0;
        
        while(i >= 0 && j < m) {
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}