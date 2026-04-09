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
    List<int[]> list = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root,0,0);
        Collections.sort(list,(a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            if(a[1]!=b[1])return a[1]-b[1];
            return a[2]-b[2];
        });
        int prevcol=Integer.MIN_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for(int[]entry:list){
            if(prevcol!=entry[0]){
            result.add(new ArrayList<>());
            prevcol= entry[0];
            }
            result.get(result.size()-1).add(entry[2]);
        }
        return result;

    }
    void dfs(TreeNode node,int col,int row){
        if(node==null)return ;
        list.add(new int[]{col,row,node.val});
        dfs(node.left,col-1,row+1);
        dfs(node.right,col+1,row+1);
    }
}