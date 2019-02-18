/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InvertABinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        flipEachRecursively(root);
        return root;
    }
    
    public void flipEachRecursively(TreeNode current) {
        TreeNode temp;
        temp = current.left;
        current.left = current.right;
        current.right = temp;
        
        if(current.left != null) {
            flipEachRecursively(current.left);
        }
        if(current.right != null) {
            flipEachRecursively(current.right);
        }
        
    }
}