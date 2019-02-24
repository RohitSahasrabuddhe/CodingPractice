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
    List<List<Integer>> levels;
    public List<Double> averageOfLevels(TreeNode root) {
        levels = new ArrayList<List<Integer>>();
        List<Double> op = new ArrayList<Double>();
        
        addLevelsRecursively(root, 1);
        
        for (int i = 0; i < levels.size(); i++) {
            long sum = 0;
            int c = 0;
            for (int j = 0; j < levels.get(i).size(); j++) {
                sum += levels.get(i).get(j);
                c++;
            }
            op.add(1.0*sum/c);
        }   
        return op;       
    }
    
    public void addLevelsRecursively(TreeNode curr, int depth) {
        if (levels.size() < depth) {
            List<Integer> list = new ArrayList<Integer>();
            levels.add(list);
        }
        levels.get(depth-1).add(curr.val);
        
        if (curr.left != null) {
            addLevelsRecursively(curr.left, depth+1);
        }
        if (curr.right != null) {
            addLevelsRecursively(curr.right, depth+1);
        }
    }
}