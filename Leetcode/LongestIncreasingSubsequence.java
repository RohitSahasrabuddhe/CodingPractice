class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] op = new int[nums.length];
        int maxVal = 0;
        for(int i = 0; i < nums.length; i++) {
            int max = 0;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    max = Math.max(max, op[j]);
                }
            }
            op[i] = max + 1;
            maxVal = Math.max(op[i], maxVal);
        }
        return maxVal;
    }
}