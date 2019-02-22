class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] asc = new int[nums.length+1];
        int[] desc = new int[nums.length+1];
        asc[0] = 1;
        desc[nums.length] = 1;
        int  l = nums.length;
        for (int i = 1; i < nums.length; i++) {
            asc[i] = nums[i-1]*asc[i-1];
            desc[l-i] = desc[l-i+1]*nums[l-i]; 
        }
        int[] op = new int[l];
        for (int i = 0; i < l; i++) {
            op[i] = asc[i]*desc[i+1];
        }
        return op;        
    }
}