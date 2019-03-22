class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj= new ArrayList<List<Integer>>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        for(int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }
        
        for(int i = 0; i < numCourses; i++) {
            if(isCyclic(i, adj)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isCyclic(int node, List<List<Integer>> adj) {
        System.out.println("Checking isCyclic for node: " + node );
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        boolean[] visit = new boolean[adj.size()];
        while(!queue.isEmpty()) {
            int curr = queue.removeFirst();
            System.out.println("Removed: " + curr);
            visit[curr] = true;
            List<Integer> neighbors = adj.get(curr);
            for(int i = 0; i < neighbors.size(); i++) {
                if(visit[neighbors.get(i)]) {
                    System.out.println("Cycle found for" + neighbors.get(i));
                    return true;
                } else {
                    queue.addLast(neighbors.get(i));
                    System.out.println("Adding: " + neighbors.get(i));
                }
            }
        }
        return false;
    }
}