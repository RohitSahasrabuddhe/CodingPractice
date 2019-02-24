class Solution {
    public void reverseWords(char[] str) {
        String inp = new String(str);
        String[] parts = inp.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length-1; i >= 0; i--) {
            sb.append(parts[i] +" ");
        }
        System.out.println(sb.toString());
        String op = sb.toString();
        
        for (int i = 0 ; i < str.length; i++) {
            str[i] = op.charAt(i);
        }
    }
}