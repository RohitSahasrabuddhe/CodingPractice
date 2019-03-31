class Trie {
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(curr.child[c-'a'] != null){
                curr = curr.child[c-'a'];
            } else{
                curr.child[c-'a'] = new Node();
                curr = curr.child[c-'a'];
            }
            if(i == word.length() - 1){
                curr.val = 5;
            }
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(curr.child[c-'a'] == null){
                return false;
            } else{
                curr = curr.child[c-'a'];
            }
            
            // Last to previous
            if(i == word.length() - 1){
                if(curr.val > 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            if(curr.child[c-'a'] == null){
                return false;
            } else{
                curr = curr.child[c-'a'];
            }            
        }
        return true;
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
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */