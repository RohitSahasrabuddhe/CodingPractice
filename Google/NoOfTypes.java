class Solution {
    public int numDecodings(String s) {
        int n = s.lenght();
        int[] sol = new int[n+1];
        
        sol[0] = 0;
        sol[1] = 1;
        for (int i = 2; i < s.length(); i++ ) {
            int one = Integer.parseInt(s.substring(i-1),i);
            int two = Integer.parseInt(s.substring(i-1,i+1));
            
            sol[i] += sol[i-1];
            if (two >= 10 && two <= 26) {
                sol[i] += sol[i-2];
            }
        }
        return sol[s.length()];
    }
}