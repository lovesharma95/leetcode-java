
import java.util.ArrayList;
import java.util.List;

public class LC_78 {

    public List<List<Integer>> subsets(int[] nums) {
        int totalSubsets = 1 << nums.length;
        ArrayList<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < totalSubsets; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    subArray.add(nums[j]);
                }
            }
            ans.add(subArray);
        }

        return ans;
    }

    public static void main(String[] args) {
        LC_78 lc = new LC_78();
        int[] example1 = {1, 2, 3};

        System.out.println("Result: " + lc.subsets(example1));
    }
}
