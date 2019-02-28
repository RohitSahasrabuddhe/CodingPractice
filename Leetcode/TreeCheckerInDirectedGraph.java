class TreeCheckerInDirectedGraph {
    public boolean validTree(int n, int[][] edges) {
        if(n == 0 || edges.length == 0) 
            return false;
        boolean[] visited = new boolean[n];
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(edges[0][0]);
        
        while (queue.size() > 0) {
            int current = queue.removeFirst();
            visited[current] = true;
            for (int[] pair : edges) {
                if(pair[0] == current) {
                    if(visited[pair[1]])
                        return false;
                    queue.add(pair[1]);
                }
            }
        }
        for(boolean b : visited){
            if (b == false)
                return false;
        }
        return true;
    }
}