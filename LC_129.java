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

public class LC_129 {

    // private int sum = 0;
    // public int sumNumbers(TreeNode root) {
    // if(root == null) return 0;
    // helper(root, "");
    // return sum;
    // }
    // public void helper(TreeNode root, String currSum) {
    // if (root == null) return;
    // currSum += root.val;
    // if (root.left == null && root.right == null) {
    // sum += Integer.parseInt(currSum);
    // return;
    // }
    // helper(root.left, currSum);
    // helper(root.right, currSum);
    // }
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int num) {
        if (node == null) {
            return 0;
        }

        num = num * 10 + node.val;

        if (node.left == null && node.right == null) {
            return num;
        }

        return dfs(node.left, num) + dfs(node.right, num);
    }

    public static void main(String[] args) {
        LC_129 lc = new LC_129();

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

        // result
        int res = lc.sumNumbers(root);

        // Print the result
        System.out.print("sum is: " + res);
    }
}
