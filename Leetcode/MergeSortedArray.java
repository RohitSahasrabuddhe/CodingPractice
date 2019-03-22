class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c1 = 0;
        int c2 = 0;
        List<Integer> op = new ArrayList<Integer>();
        
        while(c1 < m && c2 < n) {
            if(nums1[c1] <= nums2[c2]) {
                op.add(nums1[c1]);
                c1++;
            }
            else {
                op.add(nums2[c2]);
                c2++;
            }
        }
        while(c1 < m) {
            op.add(nums1[c1]);
            c1++;
        }
        while(c2 < n) {
            op.add(nums2[c2]);
            c2++;
        }
        
        for(int i = 0; i < op.size(); i++) {
            nums1[i] = op.get(i);
        }
    }
}