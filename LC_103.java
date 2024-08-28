// Definition for a binary tree node.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

public class LC_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);
        boolean ltr = true;

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode head = queue.poll();

                if (ltr == true) {
                    level.add(head.val);
                } else {
                    level.add(0, head.val);
                }

                if (head.left != null) {
                    queue.add(head.left);
                }

                if (head.right != null) {
                    queue.add(head.right);
                }
            }

            ltr = !ltr;

            list.add(level);
        }

        return list;
    }

    public static void main(String[] args) {
        LC_103 lc = new LC_103();

        // Create a sample tree:
        //       4
        //      / \
        //     1   2
        //    / \ / \
        //   0  1 4  3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // result
        List<List<Integer>> res = lc.zigzagLevelOrder(root);

        // Print the resulting tree
        System.out.print("Result: " + res);
    }
}
