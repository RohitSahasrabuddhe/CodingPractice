class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int mStart = 0;
        int nStart = 0;
        int mEnd = m;
        int nEnd = n;
        while (mStart < mEnd && nStart < nEnd) {
            int mMid = (mEnd -mStart)/2;
            int nMid = (nEnd-nStart)/2;
            if (target == matrix[mMid][nMid]){
                return true;
            }
            else if (target > matrix[mMid][nMid]) {
                mStart = mMid+1;
                nStart = nMid+1;
            }
            else{
                mEnd = mMid-1;
                nEnd = nMid-1;
            }
        }
        return false;
    }
}