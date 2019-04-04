class MaxStack {
    LinkedList<Integer> stack;
    PriorityQueue<Integer> maxHeap;
    
    /** initialize your data structure here. */
    public MaxStack() {
        stack = new LinkedList<Integer>();
        maxHeap = new PriorityQueue<Integer>(5, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i2-i1;
            } 
        });
    }
    
    public void push(int x) {
        stack.addFirst(x);
        maxHeap.add(x);
    }
    
    public int pop() {
        if(stack.size() <= 0){
            return -1;
        } else{
            int top = stack.removeFirst();
            maxHeap.remove(top);
            return top;
        }
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int peekMax() {
        return maxHeap.peek();
    }
    
    public int popMax() {
        int top = maxHeap.poll();
        int index = 0;
        for(int i :stack){
            if(i == top){
                index = i;
                break;
            }
        }
        stack.remove(new Integer(top));
        return top;
    }
}
