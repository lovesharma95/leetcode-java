
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LC_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return listOfLists;
        }

        Arrays.sort(nums);

        for (int x = 0; x < nums.length - 2; x++) {
            if (x > 0 && nums[x] == nums[x - 1]) {
                continue;
            }

            int target = -nums[x];
            int y = x + 1;
            int z = nums.length - 1;

            while (y < z) {
                int sum = nums[y] + nums[z];
                if (sum < target) {
                    y++;
                } else if (sum > target) {
                    z--;
                } else {
                    listOfLists.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    y++;
                    z--;

                    while (y < z && nums[y] == nums[y - 1]) {
                        y++;
                    }
                    while (y < z && nums[z] == nums[z + 1]) {
                        z--;
                    }
                }
            }
        }

        return listOfLists;
    }

    private List<Integer> createList(int x, int y, int z, int[] nums) {
        List<Integer> triplet = new ArrayList<>();
        triplet.add(nums[x]);
        triplet.add(nums[y]);
        triplet.add(nums[z]);

        return triplet;
    }

    public static void main(String[] args) {
        LC_15 lc = new LC_15();
        int[] example1 = {-1, 0, 1, 2, -1, -4};

        System.out.println("Result: " + lc.threeSum(example1));
    }
}
