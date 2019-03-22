class Max1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        int n = nums.length;
        
        while(r < n) {
            while(r < n && nums[r] == 1) {
                r++;
            }
            max = Math.max(max, r-l);
            while(r < n && nums[r] == 0) {
                r++;
            }
            l = r;
        }
        return max;
    }
}