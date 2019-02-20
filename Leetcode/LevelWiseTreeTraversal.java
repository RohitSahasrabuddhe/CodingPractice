/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LevelWiseTreeTraversal {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root != null) {
           levelRecursively(root, 1);
        }        
        return list;
    }
    
    public void levelRecursively(TreeNode current, int depth) {
        if(list.size() < depth) {
            list.add(new ArrayList<Integer>());
        }
        list.get(depth-1).add(current.val);
        if (current.left != null) {
            levelRecursively(current.left, depth+1);
        }
        if (current.right != null) {
            levelRecursively(current.right, depth+1);
        }
    }
    
}