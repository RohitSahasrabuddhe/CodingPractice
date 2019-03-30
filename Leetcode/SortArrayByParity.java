class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 0){
            return nums;
        }
        int l = 0;
        int r = nums.length-1;
        
        while(l < r){
            while(l < r && nums[l]%2 == 0){
                l++;
            }
            while(r > l && nums[r]%2 == 1){
                r--;
            }
            
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
      return nums;  
    }
}