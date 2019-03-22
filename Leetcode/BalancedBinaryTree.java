/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int lh;
        int rh;
        
        if(root == null) {
            return true;
        }
        
        lh = height(root.left);
        rh = height(root.right);
        
        if(Math.abs(lh-rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }
    
    public int height(TreeNode curr) {
        if(curr == null) {
            return 0;
        }
        
        return (Math.max(height(curr.left), height(curr.right)) + 1);
        
    }
}