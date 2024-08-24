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

public class LC_2415 {

    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        reverse(root.left, root.right, 1);
        return root;
    }

    private void reverse(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) {
            return;
        }

        if (level % 2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        reverse(left.left, right.right, level + 1);
        reverse(left.right, right.left, level + 1);
    }

    public static void main(String[] args) {
        LC_2415 lc = new LC_2415();

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
        root.left.right = new TreeNode(2, null, null);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7, null, null);

        // result
        TreeNode res = lc.reverseOddLevels(root);

        // Print the resulting tree
        System.out.print("Result: " + res);
    }
}
