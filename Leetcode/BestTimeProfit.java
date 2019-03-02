class BestTimeProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int p : prices) {
            max = Math.max(max, p - min);
            min = Math.min(min, p);
        }
        return Math.max(max, 0);
    }
}