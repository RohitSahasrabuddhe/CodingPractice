class Solution {
    public String toLowerCase(String str) {
        char[] op = new char[str.length()];
        char[] inp =str.toCharArray();
        int i = 0;
        for(char c : inp) {
            if(c >= 'A' && c <= 'Z' ){
                op[i] = (char)(inp[i] + 'a'-'A');
            } else{
                op[i] = inp[i];
            }
            i++;
        }
        return new String(op);
    }
}