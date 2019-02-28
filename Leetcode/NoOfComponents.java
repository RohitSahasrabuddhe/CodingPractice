class NoOfComponents {
    
    public int countComponents(int n, int[][] edges) {
        int[][] matrix = new int[n][n];
        boolean[] visited = new boolean[n];
        for(int[] pair: edges) {
            matrix[pair[0]][pair[1]] = 1;
            matrix[pair[1]][pair[0]] = 1;
        }
        int i = 0;
        int count = 0;
        while(i < n ) {
            if (visited[i] != true) {
                 count++;
            
                LinkedList<Integer> queue = new LinkedList<Integer>();
                queue.add(i);

                while(!queue.isEmpty()) {
                    int curr = queue.removeFirst();
                    visited[curr] = true;
                    for(int j = 0; j < n; j++) {
                        if(!visited[j] && matrix[curr][j] == 1) {
                            queue.addFirst(j);
                        }
                    }
                }
            
            }
            i++;
        }
        return count;
    }
    
}