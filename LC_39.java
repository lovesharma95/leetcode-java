
import java.util.ArrayList;
import java.util.List;

public class LC_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(candidates, target, 0, 0, temp, res);

        return res;
    }

    private void helper(int[] candidates, int target, int i, int curSum, List<Integer> temp, List<List<Integer>> res) {
        // bounding condition
        if (curSum > target) {
            return;
        }

        // base case
        if (curSum == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // ensure we don't go out of bounds
        if (i == candidates.length) {
            return;
        }

        // inclusion
        temp.add(candidates[i]);
        helper(candidates, target, i, curSum + candidates[i], temp, res);
        temp.remove(temp.size() - 1);

        // exclusion
        helper(candidates, target, i + 1, curSum, temp, res);
    }

    public static void main(String[] args) {
        LC_39 lc = new LC_39();
        int[] example1 = {2, 3, 6, 7};

        System.out.println("Result: " + lc.combinationSum(example1, 7));
    }
}
