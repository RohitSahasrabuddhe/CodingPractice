/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    LinkedList<Integer> list = new LinkedList<Integer>();
    int position = 0;
    public BSTIterator(TreeNode root) {
        if (root != null)
            fillListRecursively(root);
    }
    
    public void fillListRecursively(TreeNode root) {
        if (root.left != null) {
            fillListRecursively(root.left);
        }
        list.add(root.val);
        if(root.right != null) {
            fillListRecursively(root.right);
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        if (this.position >= this.list.size()) {
            return 0;
        }
        int val = list.get(this.position);
        this.position++;
        return val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (this.position < this.list.size()) {
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */