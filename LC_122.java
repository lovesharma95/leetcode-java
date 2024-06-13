
public class LC_122 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        LC_122 lc = new LC_122();
        int[] example1 = {7,1,5,3,6,4};

        System.out.println("Result: ");
        System.out.println(lc.maxProfit(example1));
    }
}
