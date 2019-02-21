class KthLargestElement {
    public int findKthLargestWithMinHeap(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        while(heap.size() > k) {
            heap.remove();
        }
        return heap.poll();
    }
}