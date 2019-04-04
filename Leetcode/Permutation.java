class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        addAll(nums, 0, set, l, op);
        
        return op;        
    }
    
    public void addAll(int[] nums, int index, Set<Integer> set, List<Integer> l, List<List<Integer>> op){
        if(index == nums.length){
            op.add(l);
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
           if(!set.contains(nums[i])){
               set.add(nums[i]);
               l.add(nums[i]);
               addAll(nums, index+1, new TreeSet<Integer>(set), new ArrayList<Integer>(l), op);
               set.remove(nums[i]);
               l.remove(l.size()-1);
           }
        }
    }
}