class MoveZeros {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1) {
            return;
        }
        int zeros = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
            else{
                nums[i-zeros] = nums[i];
                if(zeros > 0) {
                   nums[i] = 0; 
                }
                
            }
        }
    }
}