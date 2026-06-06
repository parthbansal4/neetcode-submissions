class Solution {
    public int maxProfit(int[] prices) {
        int minVal=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-minVal;
            minVal=Math.min(minVal, prices[i]);
            maxProfit= Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
