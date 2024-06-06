public class LC_27 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        LC_27 lc = new LC_27();
        int[] example1 = {3,2,2,3};

        System.out.println("Result: " + lc.removeElement(example1 , 3));
    }
}
