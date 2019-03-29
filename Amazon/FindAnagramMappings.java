class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
        
        for(int i = 0; i < B.length; i++){
            if(map.containsKey(B[i])){
                LinkedList<Integer> list = map.get(B[i]);
                list.add(i);
            } else{
                LinkedList<Integer> l = new LinkedList<Integer>();
                l.add(i);
                map.put(B[i],l);
            }
        }
        
        int[] op = new int[A.length];
        
        for(int i = 0; i < A.length; i++){
            op[i] = map.get(A[i]).removeFirst();
        }
        return op;
    }
}