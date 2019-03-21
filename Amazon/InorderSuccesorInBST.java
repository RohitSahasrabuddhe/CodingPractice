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
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode> inorder = new ArrayList<TreeNode>();
        
        inorderTraversal(root, inorder);
        
        
        int c = 0;
        for(c = 0; c < inorder.size(); c++) {
            if (inorder.get(c) == p) {
                break;
            }
        }
        
        if(c < inorder.size()-1) {
            return inorder.get(c+1);
        }
        return null;
    }
    
    public void inorderTraversal(TreeNode curr, List<TreeNode> inorder) {
        if(curr.left != null) {
            inorderTraversal(curr.left, inorder);
        }
        inorder.add(curr);
        if(curr.right != null) {
            inorderTraversal(curr.right, inorder);
        }
    }
}