/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreordalTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        List<Integer> op = new ArrayList<Integer>();
        stack.add(root);
        
        while(stack.size() > 0 && root != null) {
            TreeNode current = stack.removeFirst();
            op.add(current.val);
            
            if(current.right != null) {
                stack.addFirst(current.right);
            }
            if(current.left != null) {
                stack.addFirst(current.left);
            }
            
        }
        return op;   
    }
}