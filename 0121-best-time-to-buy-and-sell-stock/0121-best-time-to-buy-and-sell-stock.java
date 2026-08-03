class Solution {
    public int maxProfit(int[] prices) {
        int current_buy=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < current_buy){
                current_buy=prices[i];
            }
            else{
                int current_profit=prices[i] -current_buy;
                profit=Math.max(current_profit, profit);
            }
        }
        return profit;
    }
}