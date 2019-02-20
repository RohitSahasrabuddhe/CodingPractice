class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        long op = 1;
        for (int i = 1; i < n; i++) {
            op = (2*(2*i+1)*op)/(i+2);
        }
        return (int)op;
    }
}