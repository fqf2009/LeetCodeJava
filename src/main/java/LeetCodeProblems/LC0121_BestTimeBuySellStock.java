package LeetCodeProblems;

public class LC0121_BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int profit = 0;
        for (int p : prices) {
            min_price = Integer.min(min_price, p);
            profit = Integer.max(profit, p - min_price);
        }
        return profit;
    }
}
