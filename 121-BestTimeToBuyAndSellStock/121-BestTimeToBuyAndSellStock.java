// Last updated: 27/04/2026, 04:06:19
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int s = prices.length;
        int maxp = 0;
        for(int i=0;i<s;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                maxp = Math.max(maxp,prices[i]-min);
            }
        }
        System.gc();
        return maxp;
    }
}