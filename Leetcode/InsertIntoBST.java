/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr = root;
        
        while (true) {
            if (val > curr.val) {
                // Right
                if(curr.right == null) {
                    TreeNode n = new TreeNode(val);
                    curr.right = n;
                    break;
                } else {
                    curr = curr.right;
                }
            } else{
                // left
                if(curr.left == null) {
                    TreeNode n = new TreeNode(val);
                    curr.left = n;
                    break;
                } else {
                    curr = curr.left;
                }
            }
        }
        return root;
    }
}