
public class LC_31 {

    public void nextPermutation(int[] nums) {
        int index1 = -1;
        int index2 = nums.length - 1;

        for (int j = nums.length - 2; j >= 0; j--) {
            if (nums[j] < nums[j + 1]) {
                index1 = j;
                break;
            }
        }

        if (index1 == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i > index1; i--) {
            if (nums[i] > nums[index1]) {
                index2 = i;
                break;
            }
        }

        swap(nums, index1, index2);

        reverse(nums, index1 + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        LC_31 lc = new LC_31();
        int[] example1 = {1, 2, 3};

        lc.nextPermutation(example1);

        for (int e : example1) {
            System.out.println(e);
        }

    }
}
