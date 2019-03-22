class Solution {
    public String frequencySort(String s) {
        char[] inp = s.toCharArray();
        
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c : inp) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<Character>(5, new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                return map.get(c2) - map.get(c1);
            }
        });
        
        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            pq.add(e.getKey());
        }
        
        char[] opArray = new char[s.length()];
        int index= 0;
        while(!pq.isEmpty()) {
            char c = pq.poll();
            int count = map.get(c);
            for(int i = 0; i < count; i++) {
                opArray[index++] = c;
            }
        }
        String op = String.copyValueOf(opArray);
        return op;
    }
}