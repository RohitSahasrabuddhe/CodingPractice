class Solution {
    public String nextClosestTime(String time) {
        Set<Integer> s = new HashSet<Integer>();
        
        for(char c : time.toCharArray()) {
            if(c != ':') {
                int i = (int) (c - 48);
                if(!s.contains(i)) {
                    s.add(i);
                }
            }
        }
        
        String[] parts = time.split(":");
        
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        int cur = h*60+m;
        
        while(true) {
            cur = (cur+1)%(24*60);
            
            int[] digits = new int[]{cur / 60 / 10, cur / 60 % 10, cur % 60 / 10, cur % 60 % 10};
            
            search : {
                for (int d: digits) if (!s.contains(d)) break search;
                return String.format("%02d:%02d", cur / 60, cur % 60);
            }
            
            
        }
        
        
        
    }
}