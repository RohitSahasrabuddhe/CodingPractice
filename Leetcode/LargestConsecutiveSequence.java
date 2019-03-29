class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int n: nums){
            set.add(n);
        }
        int op = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int curr = n;
                int c = 0;
                
                while(set.contains(curr)){
                    c++;
                    curr++;
                }
                op = Math.max(op,c);
            }
        }
        return op;
    }
}