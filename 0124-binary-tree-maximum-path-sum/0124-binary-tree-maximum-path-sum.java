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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxi(root);
        return maxsum;
    }
    public int maxi(TreeNode root){
        if(root==null){
            return 0;
        }
        int left= Math.max(0,maxi(root.left));
        int right= Math.max(0,maxi(root.right));
        maxsum= Math.max(maxsum,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}