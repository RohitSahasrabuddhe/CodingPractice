class Solution {
    public int totalFruitNieve(int[] tree) {
        int max = 0;
        for (int i = 0; i < tree.length; i++) {
            int current = getFruitsCount(tree, i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
    
    public int getFruitsCount(int[] tree, int index) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = index; i < tree.length; i++) {
            if (map.containsKey(tree[i])) {
                map.put(tree[i],map.get(tree[i] + 1));
                count++;
            }
            else if(map.size() < 2){
                map.put(tree[i], 1);
                count++;
            }
            else {
               return count; 
            }
        }
        return count;
    }
}