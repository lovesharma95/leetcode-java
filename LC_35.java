
public class LC_35 {

    public int searchInsert(int[] nums, int target) {
        return searchInsertHelper(nums, target, 0, nums.length - 1);
    }

    private int searchInsertHelper(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return searchInsertHelper(nums, target, left, mid - 1);
        } else {
            return searchInsertHelper(nums, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        LC_35 lc = new LC_35();
        int[] example1 = {1, 3, 5, 6};
        int target = 7;

        System.out.println("Result: " + lc.searchInsert(example1, target));
    }
}
