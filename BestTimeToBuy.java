class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        
        int length = prices.length;
        int profit = 0 ; 
        int start = -1;
        int end = -1;
                
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++){
                int currentProfit = prices[j] - prices[i];
                if (profit < currentProfit) {
                    profit = currentProfit;
                    start = i;
                    end = j;
                }
            }
            
        }
        System.out.println("Start End are: " + start + " : " + end +" Profit is: " + profit);
        
        return profit;
    }
}