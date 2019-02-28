class ReconstructItenrary {
    public List<String> findItinerary(String[][] tickets) {
        Map<String, String> map = new HashMap<String, String>();
        
        for(String[] pair: tickets) {
            if(map.containsKey(pair[0])) {
                if(pair[1].compareTo(map.get(pair[0])) < 0) {
                    map.put(pair[0], pair[1]);
                }
            } else {
                map.put(pair[0], pair[1]);
            }
        }
        String curr = "JFK";
        List<String> op = new ArrayList<String>();
        op.add(curr);
        while(map.containsKey(curr)) {
            curr = map.get(curr);
            op.add(curr);
        }
        
        return op;
    }
}