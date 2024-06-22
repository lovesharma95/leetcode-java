
public class LC_167 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        LC_167 lc = new LC_167();
        int[] example1 = {2, 7, 11, 15};

        System.out.println("Result:");
        for (int i : lc.twoSum(example1, 9)) {
            System.out.println(i);
        }
    }
}
