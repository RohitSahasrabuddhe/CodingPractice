/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> op = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        
        while(root != null || !queue.isEmpty()) {
            while(root != null) {
                queue.addFirst(root);
                root = root.left;
            }
            root = queue.removeFirst();
            op.add(root.val);
            root = root.right;
        }
        return op;
    }
}