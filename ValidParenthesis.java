class ValidParenthesis {
    public boolean isValid(String s) {
        LinkedList<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '{' || cur == '[') {
                queue.addFirst(cur);
            }
            else {
                if (queue.isEmpty()) {
                    return false;
                }
                char popped = queue.removeFirst();
                if((cur == '(' && popped == ')' ) || (cur == ')' && popped == '(' ) || (cur == '{' && popped == '}' ) || (cur == '}' && popped == '{' ) || (cur == '[' && popped == ']' ) || (cur == ']' && popped == '[' )  ) {
                    //System.out.println("Cur: " + cur + " Popped: " + popped);
                    //do nothing
                }
                else {
                    return false;
                }
            }
        }
        if (queue.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}