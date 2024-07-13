
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        Arrays.sort(nums);

        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                int c = b + 1;
                int d = nums.length - 1;

                while (c < d) {
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target) {
                        listOfLists.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));

                        while (c < d && nums[c] == nums[c + 1]) {
                            c++;
                        }
                        while (c < d && nums[d] == nums[d - 1]) {
                            d--;
                        }

                        c++;
                        d--;
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }

        return listOfLists;
    }

    public static void main(String[] args) {
        LC_18 lc = new LC_18();
        int[] example1 = {1, 0, -1, 0, -2, 2};

        System.out.println("Result: " + lc.fourSum(example1, 0));
    }
}
