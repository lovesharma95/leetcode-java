// Definition for a binary tree node.

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

public class LC_437 {

    public int pathSum(TreeNode root, int targetSum) {
        int count = 0;

        if (root == null) {
            return 0;
        }

        count += pathSumIncludingRoot(root, targetSum, 0); // include root

        count += pathSum(root.left, targetSum) + pathSum(root.right, targetSum); // not include root

        return count;
    }

    private int pathSumIncludingRoot(TreeNode root, int targetSum, long curSum) {
        int count = 0;

        if (root == null) {
            return 0;
        }

        curSum += root.val;

        if (curSum == targetSum) {
            count++;
        }

        count += pathSumIncludingRoot(root.left, targetSum, curSum);
        count += pathSumIncludingRoot(root.right, targetSum, curSum);

        return count;
    }

    public static void main(String[] args) {
        LC_437 lc = new LC_437();

        // Create a sample tree:
        //       4
        //      / \
        //     1   6
        //    / \ / \
        //   0  2 5  7
        //      \    \
        //       3    8
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2, null, new TreeNode(3));
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7, null, new TreeNode(8));

        // Convert the BST to GST
        int count = lc.pathSum(root, 10);

        // Print the resulting tree
        System.out.print("path sum: " + count);
    }
}
