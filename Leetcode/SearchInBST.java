/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;
        
        while(true) {
            if(curr.val == val) {
                return curr;
            }
            else if (curr.val > val && curr.left != null) {
                curr = curr.left;
            }
            else if (curr.val < val && curr.right != null) {
                curr = curr.right;
            }
            else{
                return null;
            }
        }
    }
}