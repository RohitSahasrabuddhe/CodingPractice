/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CheckBST {
    public boolean isValidBST(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode prev = null;
        while(root != null || !queue.isEmpty()) {
            while(root != null) {
                queue.addFirst(root);
                root = root.left;
            }
            TreeNode curr = queue.removeFirst();
            if(prev!= null && prev.val >= curr.val) {
                return false;
            }
            prev = curr;
            root = curr.right;
        }
        return true;
    }
}