static String minWindow(String s, String t) {
    if(s.length() < t.length()){
        return "";
    }
    Map<Character, Integer> tCount = new HashMap<Character, Integer>();
    
    for(char c : t.toCharArray()){
        tCount.put(c, tCount.getOrDefault(c, 0)+1);
    }
    int dist = tCount.size();
    
    Map<Character, Integer> sCount = new HashMap<Character, Integer>();
    int l = 0; 
    int r = 0;
    int windowDist = 0;
    int min = -1;
    int[] op = new int[2];
    while(r < s.length()){
        char curr = s.charAt(r);
        sCount.put(curr, sCount.getOrDefault(curr, 0)+1);
        
        if(tCount.containsKey(curr) && sCount.get(curr).intValue() == tCount.get(curr).intValue()){
            windowDist++;
        }
        
        while(l <= r && windowDist == dist){
            char c =s.charAt(l);
            
            if(min == -1 || r-l+1 < min){
                min = r-l+1;
                op[0] = l;
                op[1] = r;
            }
            sCount.put(c, sCount.get(c)-1);
            
            if(tCount.containsKey(c) && sCount.get(c).intValue() < tCount.get(c).intValue()){
                windowDist--;
            }
            l++;
            
        }
        r++;
    }
    if(min == -1){
        System.out.println("Here");
        return "";
    }
    return s.substring(op[0],op[1]+1);
}