class IntersectionOf2Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        List<Integer> op = new ArrayList<Integer>();
        
        for(int i : nums1) {
            set.add(i);
        }
        for(int j : nums2) {
            if(set.contains(j) && !set2.contains(j)) {
                op.add(j);
            }
            set2.add(j);
        }
        int[] opArray = new int[op.size()];
        int c = 0;
        for(int i : op) {
            opArray[c++] = i;
        }
        return opArray;
    }
}