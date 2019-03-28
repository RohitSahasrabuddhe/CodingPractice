class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int l = 0;
        int r = nums.length;        
        
        while(l <= r && l < nums.length && r >= 0){
            int mid = l + (r-l)/2;
            if(target == nums[mid]){
                return getPositions(nums, mid, target);
            }
            else if(target > nums[mid]){
                l = mid+1;
            }
            else{
                r = mid -1;
            }
        }
        int[] op = {-1, -1};
        return op;
    }
    
    public int[] getPositions(int[] nums, int i, int target){
        int l = i;
        int r = i;
        while(l - 1 >= 0 && nums[l-1] == target){
            l--;
        }
        while(r+1 < nums.length && nums[r+1] == target){
            r++;
        }
        
        int[] op = new int[2];
        op[0] = l;
        op[1] = r;
        return op;
        
    }
}