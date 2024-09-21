class BuySellStock1 {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(min_price > prices[i]){
                min_price = prices[i];
            }
            else if(min_price < prices[i]){
                int diff = prices[i] - min_price;
                if(diff > profit){
                    profit = diff;
                }
            }
        }
        return profit;
    }
}