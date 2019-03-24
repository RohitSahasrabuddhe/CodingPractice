class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder op = new StringBuilder();
        int c = 0;
        
        outer : while(true) {
            if(strs[0].length() <= c){
                break;
            }
            char curr = strs[0].charAt(c);
            for(int i = 1; i < strs.length; i++) {
                if(strs[i].length() <= c || strs[i].charAt(c) != curr){
                    break outer;
                }
            }
            op.append(curr); 
            c++;
        }       
        return op.toString();        
    }
}