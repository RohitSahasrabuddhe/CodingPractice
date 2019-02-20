/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestCommonAncestorBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> path1 = findPath(root, p);
        LinkedList<TreeNode> path2 = findPath(root, q);
        
        TreeNode output = root;
        int i = 0;
        
        while (i < Math.min(path1.size(), path2.size())) {
            if(path1.get(i).val != path2.get(i).val) {
                break;
            }
            output = path1.get(i);
            i++;
        }
        return output;
    }
    
    public LinkedList<TreeNode> findPath(TreeNode parent, TreeNode child) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        if (findRecursively(parent, child, stack)) {
            for (int i = 0; i < stack.size(); i++) {
                System.out.print(stack.get(i).val +"\t");
            }
        }
        
        return stack;
        
    }
    
    public boolean findRecursively(TreeNode parent, TreeNode child, LinkedList<TreeNode> stack) {
        if (parent == null) {
            return false;
        }
        stack.addLast(parent);
        if (parent.val == child.val) {
            return true;
        }
        if (findRecursively(parent.left, child, stack) || findRecursively(parent.right, child, stack)) {
            return true;
        }
        stack.removeLast();
        return false;
    }
}