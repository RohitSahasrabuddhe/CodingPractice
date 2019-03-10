class AllPathsFromSourceToDestination {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> opList = new ArrayList<List<Integer>>();
        
        List<Integer> currPath = new ArrayList<Integer>();
        
        DFS(opList, currPath, graph, 0);
        
        return opList;
    }
    
    public void DFS(List<List<Integer>> opList, List<Integer> currPath, int[][] graph, int curr ) {
        currPath.add(curr);
        if(curr == graph.length-1) {
            // We have found the last element
            List<Integer> op = new ArrayList<Integer>();
            for(int i = 0; i < currPath.size(); i++) {
                op.add(currPath.get(i));
            }
            opList.add(op);
        }
        else {
            for(int i = 0; i < graph[curr].length; i++) {
                DFS(opList, currPath, graph, graph[curr][i]);
            }
        }
        currPath.remove(currPath.size() - 1);
    }
}