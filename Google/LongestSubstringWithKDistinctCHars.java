class LongestSubstringWithKDistinctCHars {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // Sliding window approach
        
        
        int start = 0;
        int end = 0;
        int[] countsPerChar = new int[256];
        int max = 0;
        int distinct = 0;
        
        for (end = 0; end < s.length(); end++) {
            System.out.print(s.charAt(end));
            if (countsPerChar[(int)(s.charAt(end))] == 0) {
                // element is not present
                distinct++;   
            }
            countsPerChar[(int)(s.charAt(end))]++;
            while (distinct > k ) {
                countsPerChar[(int)s.charAt(start)]--;
                if (countsPerChar[(int)s.charAt(start)] == 0) {
                    distinct--;
                }
                start++;                
            }
            max = Math.max(max, end-start+1);
        }
        return max;
    }
}