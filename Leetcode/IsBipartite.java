class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        
        LinkedList<Integer> q1 = new LinkedList<Integer>();
        LinkedList<Integer> q2 = new LinkedList<Integer>();
        int c = 0;
        while(c < graph.length) {
            if(graph[c].length > 0) {
                q1.add(c);
                break;
            }
            c++;
        }
        
        
        while(!q1.isEmpty() || !q2.isEmpty()) {
            while(!q1.isEmpty()) {
                int curr = q1.removeFirst();
                visited[curr] = true;
                for(int i : graph[curr]) {
                    // neighbors of current element
                    if(!visited[i])
                        q2.addLast(i);
                    if(setA.contains(i)) {
                        return false;
                    }
                    if(!setB.contains(i)) {
                        setB.add(i);
                    }
                }
            }
            
            while(!q2.isEmpty()) {
                int curr = q2.removeFirst();
                visited[curr] = true;
                for(int i : graph[curr]) {
                    // neighbors of current element
                    if(!visited[i])
                        q1.addLast(i);
                    if(setB.contains(i)) {
                        return false;
                    }
                    if(!setA.contains(i)) {
                        setA.add(i);
                    }
                }
            }
            
        }
        return true;
    }
}