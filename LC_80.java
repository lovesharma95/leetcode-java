public class LC_80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2;

        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LC_80 lc = new LC_80();
        int[] example1 = {0,0,1,1,1,1,2,3,3};

        System.out.println("Result: " + lc.removeDuplicates(example1));
    }
}
