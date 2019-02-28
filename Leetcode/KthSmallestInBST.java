/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class KthSmallestInBST {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        int count = 0;
        while(root != null || !queue.isEmpty()) {
            while(root != null) {
                queue.addFirst(root);
                root = root.left;
            }
            TreeNode curr = queue.removeFirst();
            count++;
            if(count == k) {
                return curr.val;
            }
            
            root = curr.right;
        }
        return -1;
    }
}