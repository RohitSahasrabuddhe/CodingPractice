class TriangleMinimumPath {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        for(int i = m-2 ; i >= 0; i--) {
            List<Integer> curr = triangle.get(i);
            List<Integer> parent = triangle.get(i+1);
            
            for(int j = 0; j < curr.size(); j++) {
                int temp = Math.min(parent.get(j), parent.get(j+1)) + curr.get(j);                 curr.set(j, temp); 
            }
            
            
        }              
        return triangle.get(0).get(0);
    }
}