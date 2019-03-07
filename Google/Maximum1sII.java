class Maximum1sII {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 1;
        int zeros = 0;
        int max = 0;
        for(int l = 0, h = 0; h < nums.length; h++) {
            if(nums[h] == 0) {
                zeros++;
            }
            while(zeros > k) {
                if(nums[l++] == 0){
                    zeros--;
                }
            }
            max = Math.max(max, h-l+1);
        }
        return max;
    }
}