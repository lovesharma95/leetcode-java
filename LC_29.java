public class LC_29 {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long n = Math.abs((long) dividend);
        long m = Math.abs((long) divisor);
        int ans = 0;

        while(n >= m) {
            int count = 0;
            while(n >= (m << (count + 1))) { // n >= m * 2 to the power count + 1
                count++;
            }

            ans += (1 << count); // ans + 2 to the power count

            n -= (m << count); // n - (m * 2 to the power count)
        }

        return isNegative ? -ans : ans;
    }

    public static void main(String[] args) {
        LC_29 lc = new LC_29();

        System.out.println("Result: " + lc.divide(10, 3));
    }
}
