
public class LC_121 {

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }

            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }

    public static void main(String[] args) {
        LC_121 lc = new LC_121();
        int[] example1 = {7,1,5,3,6,4};

        System.out.println("Result: ");
        System.out.println(lc.maxProfit(example1));
    }
}
