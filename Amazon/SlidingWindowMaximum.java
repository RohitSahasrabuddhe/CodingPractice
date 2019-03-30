class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] op;
        if(nums.length == 0){
            op = new int[0];
            return op;
        }
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(5, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i2 - i1;
            }
        });
        op = new int[nums.length-k+1];
        
        for(int i = 0; i < k; i++){
            p.add(nums[i]);
        }
        int c = 0;
        op[c++] = p.peek();
        for(int i = k; i < nums.length; i++){
            p.remove(nums[i-k]);    
            p.add(nums[i]);
            op[c++] = p.peek();
                    
        }
        return op;
    }
}