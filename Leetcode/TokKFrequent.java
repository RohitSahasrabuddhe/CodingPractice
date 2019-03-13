class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2) {
                return (map.get(i2) - map.get(i1));
            }
        });
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int val = e.getValue();
            pq.add(key);
        }
        List<Integer> op = new ArrayList<Integer>();
        while(k-- > 0) {
            op.add(pq.poll());
        }        
        return op;
    }
}