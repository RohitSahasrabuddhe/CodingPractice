List<Integer> op = new ArrayList<Integer>();
        if(root == null) {
            return op;
        }
        listOfList = new ArrayList<List<Integer>>();
        
        generateList(root, 0);
        
        
        
        for(int i = 0; i < listOfList.size(); i++) {
            int size = listOfList.get(i).size();
            op.add(listOfList.get(i).get(size-1));
        }
        return op;
    }
    
    public void generateList(TreeNode t, int depth) {
        if(listOfList.size() < depth + 1 ) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(t.val);
            listOfList.add(list);
        } else {
            listOfList.get(depth).add(t.val);
        }
        if(t.left == null && t.right == null) {
            return;
        }
        if(t.left != null) {
            generateList(t.left, depth + 1);
        }
        if(t.right != null) {
            generateList(t.right, depth + 1);
        }
    }
}