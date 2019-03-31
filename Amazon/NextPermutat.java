class Solution {
    public void nextPermutation(int[] nums) {    
        
        for(int i = nums.length-1; i >= 1; i--){
            if(nums[i] > nums[i-1]){
                int j = i;                
                while(j < nums.length){
                    if(nums[j] <= nums[i-1]){
                        break;
                    }
                    j++;
                }
                int temp = nums[i-1];
                nums[i-1] = nums[j-1];
                nums[j-1] = temp;
                
                reverse(nums, i , nums.length-1);              
                return;
            }
        }
        reverse(nums, 0, nums.length-1);
    }
    public void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }
}