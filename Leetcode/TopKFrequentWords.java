class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String s : words) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<String>(5, new Comparator<String>() {
            public int compare(String s1, String s2) {
               if(map.get(s1) == map.get(s2)) {
                   return s1.compareTo(s2);
               } else {
                   return map.get(s2)-map.get(s1);
               }
           } 
        });
        
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            pq.add(e.getKey());
        }
        
        List<String> op = new ArrayList<String>();
        while(k-- > 0) {
            op.add(pq.poll());
        }
        return op;
    }
}