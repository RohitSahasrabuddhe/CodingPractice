class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int[] op = new int[2];
        for(int i = 0 ; i < numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                op[0] = map.get(target-numbers[i]);
                op[1] = i+1;
                break;
            } else{
                map.put(numbers[i], i+1);
            }
        }
        
        return op;
    }
}