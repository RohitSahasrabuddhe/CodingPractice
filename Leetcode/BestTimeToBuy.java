class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        
        int length = prices.length;
        if (length == 0) {
            return 0;
        }
        int[] maxArray = new int[length];
        int max = prices[length - 1];
        
        for (int i = length - 1; i >= 0; i--){
            if (prices[i] > max) {
                max = prices[i];
            }
            maxArray[i] = max;
        }
        
        int maxDif = 0;
        for (int i = 0; i < length; i++) {
            int currentDif = maxArray[i] - prices[i];
            if (currentDif > maxDif) {
                maxDif = currentDif;
            }
        }               
        
        return maxDif;
    }
    public int maxProfitBruteForce(int[] prices) {
        
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