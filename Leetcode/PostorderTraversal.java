/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PostorderTraversal {
    List<Integer> op;
    public List<Integer> postorderTraversal(TreeNode root) {
        op = new ArrayList<Integer>();
        postorder(root);
        return op;
    }
    public void postorder(TreeNode current) {
        if(current == null){
            return;
        }
        if(current.left != null) {
            postorder(current.left);
        }
        if(current.right != null) {
            postorder(current.right);
        }
        op.add(current.val);
    }
}