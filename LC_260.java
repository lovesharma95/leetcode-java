
import java.util.HashSet;

class LC_260 {

    public int[] singleNumber(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                numbers.remove(nums[i]);
            } else {
                numbers.add(nums[i]);
            }
        }
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // solution solution with constant space complexity
    //     public int[] singleNumber(int[] nums) {
    //         // Step 1: XOR all numbers to get the XOR of the two unique numbers
    //         int xor = 0;
    //         for (int num : nums) {
    //             xor ^= num;
    //         }
    //         System.out.println(xor);
    //         // Step 2: Find the rightmost set bit in xor (a bit that is different between the two unique numbers)
    //         int rightmostSetBit = xor & -xor;
    //         System.out.println(rightmostSetBit);
    //         // Step 3: Partition the numbers into two groups and XOR each group
    //         int num1 = 0;
    //         int num2 = 0;
    //         for (int num : nums) {
    //             if ((num & rightmostSetBit) == 0) {
    //                 num1 ^= num;
    //             } else {
    //                 num2 ^= num;
    //             }
    //         }
    //         // The two unique numbers
    //         return new int[] {num1, num2};
    //     }
    public static void main(String[] args) {
        LC_260 lc = new LC_260();
        int[] example1 = {1, 2, 1, 3, 2, 5};

        int[] result = lc.singleNumber(example1);
        System.out.print("Result: ");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
