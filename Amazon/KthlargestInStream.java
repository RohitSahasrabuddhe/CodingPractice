class KthLargest {
    PriorityQueue<Integer> minHeap;
    int size;

    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<Integer>(5, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i1-i2;
            }
        });
        this.size = k; 
        for(int i : nums){
            int op = this.add(i);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > this.size){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}