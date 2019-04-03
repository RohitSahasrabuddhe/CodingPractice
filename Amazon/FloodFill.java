class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int parentColor = image[sr][sc];
        fillRecursively(image, sr, sc, parentColor, newColor );
        
        return image;
        
    }
    
    public void fillRecursively(int[][] image, int x, int y, int parentColor, int newColor){
        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        
        image[x][y] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int[] d : dir){
            int newX = x+d[0];
            int newY = y+d[1];
            
            if(newX >= 0 && newX < n && newY >= 0 && newY < m && image[newX][newY] == parentColor && image[newX][newY] != newColor){
                fillRecursively(image, newX, newY, parentColor, newColor);
            }
            
        }       
        
    }
}