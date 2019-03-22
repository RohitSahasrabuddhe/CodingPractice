class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = A.length >> 1;
        for(int i : A) {
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.getOrDefault(i,0) > 1 ){
                return i;
            }
        }
        return -1;
    }
}