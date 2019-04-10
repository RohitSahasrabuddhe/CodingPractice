class Solution {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> qS = new LinkedList<Character>();
        LinkedList<Character> qT = new LinkedList<Character>();
        
        for(char c: S.toCharArray()){
            if(c == '#'){
                if(qS.size() > 0){
                    qS.removeFirst();
                }
            } else{
                qS.addFirst(c);
            }
        }
        for(char c: T.toCharArray()){
            if(c == '#'){
                if(qT.size() > 0){
                    qT.removeFirst();
                }
            } else{
                qT.addFirst(c);
            }
        }
        
        if(qS.size() == qT.size()){
            while(qS.size() > 0){
                if(qS.removeFirst() != qT.removeFirst()){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}