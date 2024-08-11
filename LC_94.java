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

public class LC_94 {

    private ArrayList<Integer> elements = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        inorderTraversal(root.left);
        elements.add(root.val);
        inorderTraversal(root.right);

        return elements;
    }

    public static void main(String[] args) {
        LC_94 lc = new LC_94();

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
        List<Integer> list = lc.inorderTraversal(root);

        // Print the resulting tree
        System.out.print("Inorder traversal is: " + list);
    }
}
