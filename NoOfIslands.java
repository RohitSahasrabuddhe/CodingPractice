class NoOfIslands {
    public static boolean visited[][];
    public int numIslands(char[][] grid) {
        int count = 0;
        if (grid.length != 0) {
            visited = new boolean[grid.length][grid[0].length];
        
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    // checking each element

                    if (grid[i][j] == '1' && visited[i][j] == false) {
                        count++;

                        DFS(grid,i,j);
                    }
                }
            }
        } 
        
        return count;
    }
    
    public void DFS(char[][] grid, int i, int j) {
        visited[i][j] = true;
        if ((i - 1) >= 0) {
            // check left
            if (grid[i-1][j] == '1' && visited[i-1][j] == false) {
                DFS(grid, i-1, j);
            }
        }
        if ((i+1) < grid.length) {
            //check right
            if (grid[i+1][j] == '1' && visited[i+1][j] == false) {
                DFS(grid, i+1, j);
            }
        }
        if ((j - 1) >= 0) {
            // check above
            if (grid[i][j-1] == '1' && visited[i][j-1] == false) {
                DFS(grid, i, j-1);
            }
        }
        if ((j + 1) < grid[0].length) {
            // check below
            if (grid[i][j+1] == '1' && visited[i][j+1] == false) {
                DFS(grid, i, j+1);
            }
        }
    }
}