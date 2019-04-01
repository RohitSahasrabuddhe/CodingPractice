class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] op = new int[1];
        op[0] = 0;
        
        recursivelyRemove(target, nums, op);
        
        return op[0];
    }
    
    public void recursivelyRemove(int curr, int[] nums, int[] op ){
        for(int i = 0; i < nums.length; i++){
            if((curr - nums[i]) == 0){
                op[0]++;
            }
            if((curr - nums[i]) > 0){
                recursivelyRemove(curr-nums[i], nums, op);
            }
        }
    }
}