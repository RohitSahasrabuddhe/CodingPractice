class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> op = new ArrayList<Integer>();
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        for(int i : nums1) {
            if(!s1.contains(i)) {
                s1.add(i);
            }
        }
        for(int i : nums2) {
            if(s1.contains(i) && !s2.contains(i)) {
                s2.add(i);
                op.add(i);
            }
        }
        int[] opArray = new int[op.size()];
        int c = 0;
        for(int i : op){
            opArray[c++] = i;
        }
        return opArray;
    }
}