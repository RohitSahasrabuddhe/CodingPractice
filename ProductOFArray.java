class ProductOFArray {
    public int[] productExceptSelf(int[] nums) {
        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        int[] sol = new int[nums.length];
        forward[0] = nums[0];
        backward[nums.length - 1] = nums[nums.length-1];
        for (int i = 1; i < nums.length ; i++) {
            forward[i] = forward[i-1] * nums[i];
            backward[nums.length-i-1] = backward[nums.length-i] * nums[nums.length-i-1];
        }
        sol[0] = backward[1];
        sol[nums.length-1] = forward[nums.length-2];
        for (int i = 1; i < nums.length-1; i++ ) {
            sol[i] = forward[i-1]*backward[i+1];
        }
        return sol;
    }
}