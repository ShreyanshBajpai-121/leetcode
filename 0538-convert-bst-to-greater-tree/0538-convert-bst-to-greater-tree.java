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
    public TreeNode convertBST(TreeNode root) {
        List<TreeNode> ans=new ArrayList<>();
        inorder(ans,root);
      Collections.reverse(ans);
      int sum=0;
      for(int i=0;i<ans.size();i++){
        int val=ans.get(i).val;
        sum+=val;
        ans.get(i).val=sum;
      }
      return root;
        }
    public void inorder(List<TreeNode>ans,TreeNode root){
        if(root==null)return;
        inorder(ans,root.left);
        ans.add(root);
        inorder(ans,root.right);
    }
}