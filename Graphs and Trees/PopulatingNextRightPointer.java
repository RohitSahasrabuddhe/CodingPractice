/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    List<List<Node>> listOfList;
    public Node connect(Node root) {
        if(root == null) {
            return root;
        }
        listOfList = new ArrayList<List<Node>>();
        
        generateList(root, 0);
        
        
        
        for(int i = 0; i < listOfList.size(); i++) {
            List<Node> curr = listOfList.get(i); 
            for (int j = 0; j < curr.size()-1; j++) {
                Node n = curr.get(j);
                n.next = curr.get(j+1);

            }
        }
        return root;
    }
    
    public void generateList(Node t, int depth) {
        if(listOfList.size() < depth + 1 ) {
            List<Node> list = new ArrayList<Node>();
            list.add(t);
            listOfList.add(list);
        } else {
            listOfList.get(depth).add(t);
        }
        if(t.left == null && t.right == null) {
            return;
        }
        if(t.left != null) {
            generateList(t.left, depth + 1);
        }
        if(t.right != null) {
            generateList(t.right, depth + 1);
        }
    }
}