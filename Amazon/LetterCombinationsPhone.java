class Solution {
    Map<Integer, String> map = new HashMap<Integer, String>() {{
    put(2, "abc");
    put(3, "def");
    put(4, "ghi");
    put(5, "jkl");
    put(6, "mno");
    put(7, "pqrs");
    put(8, "tuv");
    put(9, "wxyz");
  }};
    
    public List<String> letterCombinations(String digits) {
        List<String> op = new ArrayList<String>();
        
        for(int i = 0; i < digits.length(); i++) {
            int curr = Integer.parseInt(digits.charAt(i)+"");
            
            op = addToList(op, curr);
        }
        
        return op;        
    }
    
    
    public List<String> addToList(List<String> op, int curr) {
        List<String> newOp = new ArrayList<String>();
        if(op.size() == 0) {
            String str = map.get(curr);
            
            for(int i = 0; i < str.length(); i++){
                String s = str.charAt(i)+"";
                newOp.add(s);
            }
            
        } else{
            for(int i = 0; i < op.size(); i++) {
                String prev = op.get(i);
                String str = map.get(curr);
                for(int j = 0; j < str.length(); j++){
                    String s =  prev+"" + str.charAt(j);
                    newOp.add(s);
                }
                
            }
            
        }        
        return newOp;
    }
}