// Definition for a binary tree node.

import java.util.LinkedList;
import java.util.Queue;

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

public class LC_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode leftHead = queue.poll();
            TreeNode rightHead = queue.poll();

            if (leftHead == null && rightHead == null) {
                continue;
            }

            if (leftHead == null || rightHead == null) {
                return false;
            }

            if (leftHead.val != rightHead.val) {
                return false;
            }

            queue.add(leftHead.left);
            queue.add(rightHead.right);

            queue.add(leftHead.right);
            queue.add(rightHead.left);
        }

        return true;
    }

    public static void main(String[] args) {
        LC_101 lc = new LC_101();

        // Create a sample tree:
        //       4
        //      / \
        //     1   1
        //    / \ / \
        //   0  2 2  0
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(0);

        // result
        boolean res = lc.isSymmetric(root);

        // Print the resulting tree
        System.out.print("Result: " + res);
    }
}
