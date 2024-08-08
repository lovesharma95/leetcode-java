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

public class LC_1302 {

    public int deepestLeavesSum(TreeNode root) {
        int maxHeight = height(root);
        return sum(root, maxHeight);
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int sum(TreeNode root, int maxHeight) {
        if (root == null) {
            return 0;
        }
        if (maxHeight == 1) {
            return root.val;
        }
        return sum(root.left, maxHeight - 1) + sum(root.right, maxHeight - 1);
    }

    public static void main(String[] args) {
        LC_1302 lc = new LC_1302();

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

        int sumOfDeepestLeaves = lc.deepestLeavesSum(root);

        System.out.print("Sum of deepest leaves: " + sumOfDeepestLeaves);
    }
}
