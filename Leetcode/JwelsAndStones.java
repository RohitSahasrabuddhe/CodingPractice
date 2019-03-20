class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> j = new HashSet<Character>();
        char[] jArray = J.toCharArray();
        char[] sArray = S.toCharArray();
        for(char c: jArray) {
            j.add(c);
        }
        int op = 0;
        for(char c : sArray) {
            if(j.contains(c)) {
                op++;
            }
        }
        return op;
    }
}