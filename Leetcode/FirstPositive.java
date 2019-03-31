class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] flags = new boolean[nums.length+1];
        
        for(int i : nums){
            if(i >= 1 && i <= nums.length){
                flags[i-1] = true;
            }
        }
        
        for(int i = 0; i < flags.length; i++){
            if(!flags[i]){
                return i+1;
            }
        }
        return 1;
    }
}