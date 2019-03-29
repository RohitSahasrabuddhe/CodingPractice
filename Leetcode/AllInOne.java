class AllOne {
    Map<String, Integer> map;
    /** Initialize your data structure here. */
    public AllOne() {
        map = new HashMap<String, Integer>();
    }
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        map.put(key, map.getOrDefault(key,0)+1);
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if(map.containsKey(key)){
            if(map.get(key)== 1){
                map.remove(key);
            } else{
                map.put(key, map.get(key)-1);
            }
        }
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        int max = 0;
        String maxKey = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                maxKey = e.getKey();
            }
        }
        return maxKey;
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        int min = Integer.MAX_VALUE;
        String minKey = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() < min){
                min = e.getValue();
                minKey = e.getKey();
            }
        }
        return minKey;
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */