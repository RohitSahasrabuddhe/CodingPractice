class IsSubsequence {
    public boolean isSubsequence(String t, String s) {
        int mainS = 0;
        int subS = 0;
        
        while(mainS < s.length() && subS < t.length()) {
            //System.out.println("S[i]:" + s.charAt(mainS)+ "T[i]:" + t.charAt(subS));
            if(s.charAt(mainS) == t.charAt(subS)){
                subS++;
            }
            mainS++;
        }
        if(subS == t.length()){
            return true;
        } else {
            return false;
        }
    }
}