import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // System.out.println(complement);
            if(numbers.containsKey(complement)) {
                return new int[] {numbers.get(complement), i};
            }
            numbers.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

class LC_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}