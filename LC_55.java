public class LC_55 {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0; 
    }

    public static void main(String[] args) {
        LC_55    lc = new LC_55();
        int[] example1 = {2,3,1,1,4};

        System.out.println("Result: " + lc.canJump(example1));
    }
}
