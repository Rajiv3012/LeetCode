/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total=0;
    public int findTilt(TreeNode root) {
        calc(root);
        return total;
    }
    public int calc(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = calc(root.left);
        int right = calc(root.right);
        total += Math.abs(left-right);
        return left+right+root.val;
    }
}