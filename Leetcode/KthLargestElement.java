class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2) {
                return (i2 - i1);
            }
        });
        for(int i : nums) {
            pq.add(i);
        }
        int c = 0;
        while(c < k-1) {
            pq.poll();
            c++;
        }
        return pq.poll();
    }
}