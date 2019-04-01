class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int r = nums.length-1;
        int l = 0;
        int mid = 0; 
        while(l < r){
            if(nums[l] < nums[r]){
                return nums[l];
            } else{
                mid = (l+r)/2;
                if(nums[mid] > nums[r]){
                    // look right
                    l = mid+1;
                    //System.out.println("L: " + l + "M: " + mid + "R: " + r);
                } else{
                    // look left
                    r = mid;
                    //System.out.println("L: " + l + "M: " + mid + "R: " + r);
                }
            }           
            
        }
        return nums[r];
    }
}