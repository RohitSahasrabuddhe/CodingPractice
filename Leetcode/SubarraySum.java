class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        
       for (int i = 0; i < nums.length; i++) {
           sum = 0;
           for (int j = i; j < nums.length; j++) {
               sum += nums[j];
               if (sum == k) {
                   count++;
               }
           }
       }
        return count;
    }
}