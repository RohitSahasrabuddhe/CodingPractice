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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(isSameRecursively(p,q)){
            return true;
        }
        if(p==null || q == null){
            return false;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(p);
        
        while(!queue.isEmpty()){
            TreeNode curr = queue.removeFirst();
            if(isSameRecursively(curr, q)){
                return true;
            }
            
            if(curr.left != null){
                queue.addLast(curr.left);
            }
            if(curr.right != null){
                queue.addLast(curr.right);
            }
        }
        return false;
    }
    
    public boolean isSameRecursively(TreeNode main, TreeNode other){
        if(main == null && other == null){
            return true;
        }
        if((main == null && other != null) || (main != null && other == null)){
            return false;
        }
        if(main.val != other.val){
            return false;
        }
        
        return isSameRecursively(main.left, other.left) && isSameRecursively(main.right, other.right);
        
    }
}