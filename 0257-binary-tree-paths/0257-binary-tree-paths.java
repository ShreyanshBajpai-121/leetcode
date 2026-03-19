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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null)return list;
        path("",list,root);
        return list;
    }
    public void path(String sb,List<String> list,TreeNode root){
        if(root==null)return;
        if(sb.isEmpty()){
            sb=String.valueOf(root.val);
        }
        else{
            sb+="->"+root.val;
        }
        if(root.left==null&&root.right==null){
            list.add(sb);
            return;
        }
        path(sb, list,root.left);
        path(sb,list,root.right);

    }
}