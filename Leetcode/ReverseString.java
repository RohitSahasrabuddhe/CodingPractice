class ReverseString {
    public void reverseStringWithTempChar(char[] s) {
        int mid =  mid = s.length/2 - 1;
        for (int i = 0; i <= mid; i++) {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}