class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i) > (int)Math.floor(nums.length/2)) {
                return i;
            }
        }
        return -1;
    }
}