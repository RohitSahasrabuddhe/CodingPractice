/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaximumDepthOfBinaryTree {
    public int depth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        DFS(root,1);
        return depth;
    }
    
    public void DFS(TreeNode node, int currentDepth) {
        if (currentDepth > depth)
            depth = currentDepth;
        
        if (node.left != null){
            DFS(node.left, currentDepth+1);
        }
        if (node.right != null) {
            DFS(node.right, currentDepth+1);
        }
        return;
    }

    //Recursive approach
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}