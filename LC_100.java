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

public class LC_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.add(p);
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue2.add(q);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode head1 = queue1.poll();
            TreeNode head2 = queue2.poll();

            if (head1.val != head2.val) {
                return false;
            }

            if (head1.left != null && head2.left != null) {
                queue1.add(head1.left);
                queue2.add(head2.left);
            } else if (head1.left != null || head2.left != null) {
                return false;
            }

            if (head1.right != null && head2.right != null) {
                queue1.add(head1.right);
                queue2.add(head2.right);
            } else if (head1.right != null || head2.right != null) {
                return false;
            }
        }

        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        LC_100 lc = new LC_100();

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
        boolean res = lc.isSameTree(root, root);

        // Print the resulting tree
        System.out.print("Result: " + res);
    }
}
