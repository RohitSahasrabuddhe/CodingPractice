class BipartiteGraph {
    public boolean isBipartite(int[][] graph) {
        Set<Integer> left = new HashSet<Integer>();
        Set<Integer> right = new HashSet<Integer>();
        
        for (int[] pair : graph) {
            if (left.size() == 0) {
                left.add(pair[0]);
                right.add(pair[1]);
            }
            else{
                if(left.contains(pair[0])) {
                    if(left.contains(pair[1])){
                        return false;
                    }
                    right.add(pair[1]);
                }
                else if (right.contains(pair[0])) {
                    if (right.contains(pair[1])) {
                        return false;
                    }
                    left.add(pair[1]);
                }
            }
        }
        return true;
    }
}