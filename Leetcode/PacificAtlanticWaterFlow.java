class Solution {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> output = new ArrayList<int[]>();
        if(matrix.length == 0 || matrix[0].length == 0){
            return output;
        }        
        
        LinkedList<Pos> pQueue = new LinkedList<Pos>();
        LinkedList<Pos> aQueue = new LinkedList<Pos>();
        
        int n = matrix.length;
        int m = matrix[0].length;        
        
        boolean[][] pVisit = new boolean[n][m];
        boolean[][] aVisit = new boolean[n][m];
        
        // putting pacific in queue
        for(int i = 0; i < m; i++){
            Pos p = new Pos(0,i);
            pQueue.add(p);
        }
        for(int i = 1; i < n; i++){
            Pos p = new Pos(i, 0);
            pQueue.add(p);
        }
        
        // putting atlantic in queue
        for(int i = 0; i < n; i++){
            Pos p = new Pos(i, m-1);
            aQueue.add(p);
        }
        for(int i = 0; i < m-1; i++){
            Pos p = new Pos(n-1, i);
            aQueue.add(p);
        }
        
        BFS(matrix, pVisit, pQueue);
        BFS(matrix, aVisit, aQueue);
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(pVisit[i][j] == true && pVisit[i][j] == aVisit[i][j]){
                    int[] op = new int[2];
                    op[0] = i;
                    op[1] = j;
                    output.add(op);
                }
            }
        }
        
        return output;
    }
    
    
    public void BFS(int[][] matrix, boolean[][] visited, LinkedList<Pos> queue){       
        int[][] add = {{-1,0},{0,1},{1,0},{0,-1}};
        int n = matrix.length;
        int m = matrix[0].length;
        
        while(!queue.isEmpty()){
            Pos curr = queue.removeFirst();
            visited[curr.x][curr.y] = true;
            
            for(int[] a : add){
                int x = curr.x + a[0];
                int y = curr.y + a[1];
                
                if(x >= 0 && x < n && y >= 0 && y < m && visited[x][y] != true && matrix[x][y] >= matrix[curr.x][curr.y]){
                    Pos p = new Pos(x,y);
                    queue.addLast(p);
                }
            }
            
            
        }
    }
    
}

class Pos{
    int x;
    int y;
    
    Pos(int x, int y){
        this.x = x;
        this.y = y;
    }
}