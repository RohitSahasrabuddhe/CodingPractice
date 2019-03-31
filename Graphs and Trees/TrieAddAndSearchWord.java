class WordDictionary {
    Node root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Node();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node curr = root;
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(curr.child[c-'a'] != null){
                curr = curr.child[c-'a'];
            } else{
                curr.child[c-'a'] = new Node();
                curr = curr.child[c-'a'];
            }
            
            // just to check for ending a string
            if(i == word.length()-1){
                curr.val = 5;
            }
        }
        
        
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        LinkedList<Node> queue = new LinkedList<Node>();
        Node curr = root;
        queue.add(curr);
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            
            queue = getMeProspectiveNodes(c, queue);
            
            if(i == word.length()-1){
                for(int j = 0; j < queue.size(); j++ ){
                    Node temp = queue.get(j);
                    
                    if(temp.val > 0){
                        return true;
                    }
                }
            }
            
            
        }
        return false;
    }
    
    public LinkedList<Node> getMeProspectiveNodes(char c, LinkedList<Node> queue){
        LinkedList<Node> op = new LinkedList<Node>();
        if(queue.size() == 0){
            return op;
        }
        if(c == '.'){
            for(int i = 0; i < queue.size(); i++){
                Node currParent = queue.get(i);
                for(int j = 0; j < 26; j++){
                    if(currParent.child[j] != null){
                        op.add(currParent.child[j]);
                    }
                }
            }
        } else{
            for(int i = 0; i < queue.size(); i++){
                Node currParent = queue.get(i);
                if(currParent.child[c-'a'] != null){
                    op.add(currParent.child[c-'a']);
                }                
            }
        }
        return op;
    }
}

class Node{
    Node[] child;
    int val = 0;
    
    Node(){
        child = new Node[26];
    }
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */