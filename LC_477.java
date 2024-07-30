
public class LC_477 {

    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                count += ((nums[j] >> i) & 1);
            }
            res += count * (nums.length - count);
        }
        return res;
    }

    public static void main(String[] args) {
        LC_477 lc = new LC_477();
        int[] example1 = {4, 14, 2};

        int result = lc.totalHammingDistance(example1);
        System.out.print("Result: " + result);
    }
}
