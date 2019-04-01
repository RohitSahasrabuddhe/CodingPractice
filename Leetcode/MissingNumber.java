class MissingNumber {
    public int missingNumber(int[] nums) {
        boolean[] flags = new boolean[nums.length+1];
        
        for (int i = 0; i < nums.length; i++) {
            flags[nums[i]] = true;
        }
        
        for (int i = 0; i < flags.length; i++) {
            if(flags[i] == false) {
                return i;
            }
        }
        //hopefully code doesn't come till this stage
        return 0;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        for(int num : nums){
            sum += num;
        }
        return actualSum - sum;
    }
}