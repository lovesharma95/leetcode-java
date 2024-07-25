
public class LC_494 {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (Math.abs(target) > sum) {
            return 0;
        }

        // multiply sum + 1 by 2 because we can have either + or - value
        // setting all values to min
        int[][] memo = new int[nums.length][2 * sum + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2 * sum + 1; j++) {
                memo[i][j] = Integer.MIN_VALUE;
            }
        }

        return helper(nums, target, 0, 0, sum, memo);
    }

    private int helper(int[] nums, int target, int sum, int i, int offset, int[][] memo) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        // check and returns iff value exist in memo
        if (memo[i][sum + offset] != Integer.MIN_VALUE) {
            return memo[i][sum + offset];
        }

        // set memo value
        memo[i][sum + offset] = helper(nums, target, sum + nums[i], i + 1, offset, memo) + helper(nums, target, sum - nums[i], i + 1, offset, memo);
        return memo[i][sum + offset];
    }

    public static void main(String[] args) {
        LC_494 lc = new LC_494();
        int[] example1 = {1, 1, 1, 1, 1};

        System.out.println("Result: " + lc.findTargetSumWays(example1, 3));
    }
}
