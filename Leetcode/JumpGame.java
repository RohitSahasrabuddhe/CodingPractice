class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int n = nums.length;
        queue.addFirst(n-1);
        
        while(queue.size() > 0) {
            int index = queue.removeFirst();
            
            for(int i = index-1; i >= 0; i--) {
                if(nums[i] >= index-i){
                    if(i==0) {
                        return true;
                    }
                    queue.addFirst(i);
                }
            }
        }
        return false;
    }
}