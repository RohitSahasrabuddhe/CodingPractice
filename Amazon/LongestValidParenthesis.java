class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.addFirst(-1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.addFirst(i);
            } else{
                // ')' came we need to check for valid index
                stack.removeFirst();
                if(stack.isEmpty()){
                    stack.addFirst(i);
                } else{
                    ans = Math.max(ans, i-stack.get(0));
                }
                
                
            }
        }
        return ans;
    }
}