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
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> wraplist = new ArrayList<>();
//         Queue<TreeNode> queue = new LinkedList<>();
//         if(root==null){
//             return wraplist;
//         }
//         queue.offer(root);
//         while(!queue.isEmpty()){
//         int levelnum = queue.size();
//         List<Integer>sublist = new ArrayList<>();
//         for(int i=0;i<levelnum;i++){
//             if(queue.peek().left!=null){
//                 queue.offer(queue.peek().left);
//             }
//             if(queue.peek().right!=null){
//                 queue.offer(queue.peek().right);
//             }
//             sublist.add(queue.poll().val);
//         }
//         wraplist.add(sublist);
//         }
//         return wraplist;
//     }
// }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        lvl(root,0,ans);
        return ans;
    }
    public void lvl(TreeNode root, int level,List<List<Integer>> ans ){
        if(root==null){
            return;
        }
        if(level == ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        lvl(root.left,level+1,ans);
        lvl(root.right,level+1,ans);
    }
}