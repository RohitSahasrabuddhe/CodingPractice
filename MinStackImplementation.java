class MinStackImplementation {
    int min;
    LinkedList<Integer> list;
    /** initialize your data structure here. */
    public MinStack() {
        this.min = Integer.MAX_VALUE;
        list = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        if (x < this.min) {
            this.min = x;
        }
        list.addFirst(x);
    }
    
    public void pop() {
        int x = list.removeFirst();
        if (x == this.min) {
            this.min = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < this.min) {
                    this.min = list.get(i);
                }
            }
        }
        
    }
    
    public int top() {
        return list.get(0);
    }
    
    public int getMin() {
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */