class MovingAverage {
    
    LinkedList<Integer> list;
    int size;
    int sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.list = new LinkedList<Integer>();
        this.size = size;
        this.sum = 0;
    }
    
    public double next(int val) {
        if(list.size() == size) {
            int removedVal = list.removeFirst();
            list.addLast(val);
            sum += val;
            sum -= removedVal;
        } else{
            list.addLast(val);
            sum += val;
        }
        double avg = (sum*1.0)/(list.size());
        return avg;
    }
}
