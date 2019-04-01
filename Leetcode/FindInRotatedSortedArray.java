class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int minIndex = findMin(nums);
        int l = 0;
        int r =nums.length-1;
        if(target > nums[r]){
            return searchIt(nums, l, minIndex, target);
        } else{
            return searchIt(nums, minIndex, r, target); 
        }
    }
    
    public int searchIt(int[] nums, int i, int j, int target){
        if(nums[i] == target){
            return i;
        }if(nums[j] == target){
            return j;
        }
        while(i <= j){
            int mid = (i+j)/2;
            
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                j = mid - 1;
            } else{
                i = mid + 1;
            }
        }
        return -1;
    }
    
    public int findMin(int[] nums) {
        
        int r = nums.length-1;
        int l = 0;
        int mid = 0; 
        while(l < r){
            if(nums[l] < nums[r]){
                return l;
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
        return r;
    }
}