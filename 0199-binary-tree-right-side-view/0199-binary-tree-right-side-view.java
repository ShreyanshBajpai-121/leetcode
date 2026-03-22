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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        right(list,0,root);
        return list;
    }
    public void right(List<Integer> list,int level,TreeNode root){
     if(root==null)return;
     if(level>=list.size())
        list.add(root.val);
     else
        list.set(level,root.val);
    right(list,level+1,root.left);
    right(list,level+1,root.right);
    }
}