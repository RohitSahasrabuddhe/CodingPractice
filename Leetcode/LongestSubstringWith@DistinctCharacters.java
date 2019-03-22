class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.equals(new String(""))) {
            return 0;
        }
        int[] count = new int[256];
        int l = 0;
        int r = 0;
        int dist = 0;
        int max = Integer.MIN_VALUE;
        while(r < s.length()) {
            if(count[s.charAt(r)] == 0) {
                dist++;
                count[s.charAt(r)]++;
                r++;
            } else {
                count[s.charAt(r)]++;
                r++;
            }
            
            if(dist > 2) {
                while(l <= r) {
                    if(count[s.charAt(l)] == 1) {
                        count[s.charAt(l)]--;
                        dist--;
                        l++;
                        break;
                    } else {
                        count[s.charAt(l)]--;
                        l++;
                    }
                } 
            }
            max = Math.max(max, r-l);
            
        }
        return max;
    }
}