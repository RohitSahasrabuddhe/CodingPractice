class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        
        List<Integer> currList = new ArrayList<Integer>();
        backtrack(nums, 0, currList, op);
        
        return op;
    }
    
    
    public void backtrack(int[] nums, int index, List<Integer> l, List<List<Integer>> op) {
        if(index <= nums.length){
            op.add(l);
        }
        
        for(int i = index; i < nums.length; i++){
            l.add(nums[i]);
            backtrack(nums, i+1, new ArrayList<Integer>(l), op );
            l.remove(l.size()-1);
        }
        return;
    }
    
    
}