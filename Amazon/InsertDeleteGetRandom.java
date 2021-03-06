class RandomizedSet {

    Map<Integer, Integer> map;
    ArrayList<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        } else {
            int index = list.size();
            list.add(val);
            map.put(val, index);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        } else{
            int index = map.get(val);
            int last = list.get(list.size()-1);
            list.set(index, last);
            map.put(last, index);
            list.remove(list.size()-1);
            map.remove(val);
            return true;
            
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        return (list.get(rand.nextInt(list.size())));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */