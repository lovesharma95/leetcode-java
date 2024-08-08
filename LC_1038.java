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

public class LC_1038 {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Reverse inorder traversal
        this.bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        this.bstToGst(root.left);

        return root;
    }

    // Helper function to print the tree inorder (for testing)
    public void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        LC_1038 lc = new LC_1038();

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
        TreeNode newRoot = lc.bstToGst(root);

        // Print the resulting tree
        System.out.print("Inorder traversal of GST: ");
        lc.printInOrder(newRoot); // Should print the values of the GST in ascending order
    }
}
