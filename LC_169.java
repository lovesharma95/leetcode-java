public class LC_169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer majorElement = null;

        for (int num : nums) {
            if (count == 0) {
                majorElement = num;
            }
            count += (num == majorElement) ? 1 : -1;
        }

        return majorElement;
    }

    public static void main(String[] args) {
        LC_169 lc = new LC_169();
        int[] example1 = {2,2,1,1,1,2,2};

        System.out.println("Result: " + lc.majorityElement(example1));
    }
}
