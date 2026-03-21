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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean pos=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
              TreeNode front=q.remove();
              if(pos)
              level.addLast(front.val);
              else level.addFirst(front.val);
               if(front.left!=null) q.add(front.left);
               if(front.right!=null)q.add(front.right);
            }
            pos=!pos;
            ans.add(level);
        }
        return ans;
    }
}