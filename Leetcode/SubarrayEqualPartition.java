class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sums[i] = sums[i-1] + nums[i];
        }
        
        for(int i = 0; i < nums.length; i++){
            if(sums[i] == (sums[nums.length-1] - sums[i])){
                return true;
            }
        }
        return false;
    }
}