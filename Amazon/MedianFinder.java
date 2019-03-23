class MedianFinder {
    PriorityQueue<Integer> low; // A max heap
    PriorityQueue<Integer> high; // A min heap
    /** initialize your data structure here. */
    public MedianFinder() {
        low = new PriorityQueue<Integer>(5, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        } );
        high = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        low.add(num);
        
        high.add(low.peek());
        low.poll();
        
        if(low.size() < high.size()) {
            low.add(high.peek());
            high.poll();
        }
        
    }
    
    public double findMedian() {
        if(low.size() > high.size()) {
            return (double) low.peek();
        } else{
            return (low.peek() + high.peek()) * 0.5;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */