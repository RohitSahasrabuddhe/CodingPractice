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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
    
    public int height(TreeNode curr){
        if(curr == null){
            return 0;
        }
        int left = height(curr.left);
        int right = height(curr.right);
        max = Math.max(max, left+right);
        return Math.max(left, right) + 1;
    }
}