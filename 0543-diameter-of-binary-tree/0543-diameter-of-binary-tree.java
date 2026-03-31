class Solution {
    int maxDia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDia;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        maxDia = Math.max(maxDia, left + right); // diameter at this node

        return Math.max(left, right) + 1; // height return karo
    }
}