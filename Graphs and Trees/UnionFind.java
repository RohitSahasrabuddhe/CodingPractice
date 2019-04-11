class Solution {
    public boolean validTree(int n, int[][] edges) {
        DisjointSet d = new DisjointSet(n);
        
        for(int[] edge : edges){
            if(d.find(edge[0]) == d.find(edge[1])){
                return false;
            }
            d.union(edge[0],edge[1]);
        }
        
        if(checkConnected(n, edges)){
            return true;
        }
        return false;
    }
}
class DisjointSet{
    int[] parent;
    int size;
    DisjointSet(int size){
        this.size = size;
        this.parent = new int[size];
        for(int i = 0; i < size; i++){
            this.parent[i] = i;
        }
    }
    
    public int find(int i){
        if(this.parent[i] == i){
            return i;
        }
        
        return find(this.parent[i]);
    }
    
    public void union(int x, int y){
        if(this.parent[x] == this.parent[y]){
            return;
        }
        
        int xPar = this.find(x);
        int yPar = this.find(y);
        
        this.parent[xPar] = yPar;
    }
}