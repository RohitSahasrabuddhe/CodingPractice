/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PathSum {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        DFS(root, sum, 0);
        return flag;
    }
    
    public void DFS(TreeNode curr, int sum, int pathSum) {
        pathSum += curr.val;
        if (curr.left == null && curr.right == null) {
            if(pathSum == sum) 
                flag = true;
        }
        if(curr.right != null) {
            DFS(curr.right, sum, pathSum);
        }
        if(curr.left != null) {
            DFS(curr.left, sum, pathSum);
        }
    }
}