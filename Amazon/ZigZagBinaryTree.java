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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        
        createLevelOrder(root, 0, op);
        
        for(int i = 0; i < op.size(); i++){
            if(i%2 == 1){
                // reverse the array
                List<Integer> currList = op.get(i);
                List<Integer> l = new ArrayList<Integer>();
                for(int j = currList.size()-1; j >= 0; j--){
                    l.add(currList.get(j));
                }
                //Arrays.reverse(currList);
                op.set(i, l);
            }
        }
        return op;
    }
    
    public void createLevelOrder(TreeNode curr, int depth, List<List<Integer>> op) {
        if(curr == null){
            return;
        }
        if(op.size() < depth+1){
            List<Integer> list = new ArrayList<Integer>();
            op.add(list);
        }
        
        op.get(depth).add(curr.val);
        
        if(curr.left != null){
            createLevelOrder(curr.left, depth+1, op);
        }
        if(curr.right != null){
            createLevelOrder(curr.right, depth+1, op);
        }        
    }
}