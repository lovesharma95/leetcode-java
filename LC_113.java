// Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LC_113 {

    private List<Integer> tempArray = new ArrayList<>();
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return result;
        }

        targetSum -= root.val;
        tempArray.add(root.val);

        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                result.add(new ArrayList<>(tempArray));
            }
        } else {
            pathSum(root.left, targetSum);
            pathSum(root.right, targetSum);
        }

        tempArray.remove(tempArray.size() - 1);

        return result;
    }

    public static void main(String[] args) {
        LC_113 lc = new LC_113();

        // Create a sample tree:
        //       4
        //      / \
        //     1   1
        //    / \ / \
        //   0  2 5  7
        //      \    \
        //       3    8
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2, null, new TreeNode(3));
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7, null, new TreeNode(8));

        List<List<Integer>> paths = lc.pathSum(root, 10);

        // Print the resulting tree
        System.out.print("paths: " + paths);
    }
}
