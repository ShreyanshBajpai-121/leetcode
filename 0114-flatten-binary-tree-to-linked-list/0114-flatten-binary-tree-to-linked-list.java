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
    public void flatten(TreeNode root) {
       List<TreeNode> list=new ArrayList<>();
        if(root==null)return;
        add(list,root);
        for(int i=0;i<list.size()-1;i++){
            list.get(i).right=list.get(i+1);
            list.get(i).left=null;
        }
    list.get(list.size()-1).left=null;
    list.get(list.size()-1).right=null;
    }
    public void add(List<TreeNode> list,TreeNode root){
        if(root==null) return;
        list.add(root);
        add(list,root.left);
        add(list,root.right);
    }

}