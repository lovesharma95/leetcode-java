
import java.util.ArrayList;
import java.util.List;

public class LC_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        helper(nums, temp, res, used);
        return res;
    }

    private void helper(int[] nums, List<Integer> temp, List<List<Integer>> res, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            temp.add(nums[i]);
            helper(nums, temp, res, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        LC_46 lc = new LC_46();
        int[] example1 = {1, 2, 3};

        System.out.println("Result: " + lc.permute(example1));
    }
}
