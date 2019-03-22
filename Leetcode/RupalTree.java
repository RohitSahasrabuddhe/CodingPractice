public class RupalTree {

	public static void main(String[] args) {
		TreeNode parent = new TreeNode(6);

		TreeNode childL = new TreeNode(7);
		TreeNode childR = new TreeNode(8);

		parent.setLeftChild(childL);
		parent.setRightChild(childR);
		
		System.out.println(childR.parent.val);
	}

}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	TreeNode(int val) {
		this.val = val;
 	}
	
	void setLeftChild(TreeNode lChild) {
		this.left = lChild;
		lChild.parent = this; 
	}
	void setRightChild(TreeNode rChild) {
		this.right = rChild;
		rChild.parent = this; 
	}
	
}
