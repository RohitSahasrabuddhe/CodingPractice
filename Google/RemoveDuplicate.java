class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!s.contains(nums[i])) {
                s.add(nums[i]);
                nums[s.size()-1] = nums[i];
            }
        }
        return s.size();
    }
}