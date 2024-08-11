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

public class LC_112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum -= root.val;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {
        LC_112 lc = new LC_112();

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
        boolean isPathExist = lc.hasPathSum(root, 15);

        // Print the resulting tree
        System.out.print("is path exist: " + isPathExist);
    }
}
