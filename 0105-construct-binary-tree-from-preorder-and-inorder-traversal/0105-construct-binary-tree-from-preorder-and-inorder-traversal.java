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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        return build(0,n-1,0,n-1,preorder,inorder);
    }
    public static TreeNode build(int plo,int phi,int inlo,int inhi,int[]pre,int[] ino){
        if(plo>phi||inlo>inhi) return null;
        int val=pre[plo];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inlo;i<=inhi;i++){
            if(ino[i]==val){
                r=i;
                break;
            }
        }
            int cnt=r-inlo;
            root.left=build(plo+1,plo+cnt,inlo,r-1,pre,ino);
            root.right=build(plo+cnt+1,phi,r+1,inhi,pre,ino);
            return root;
        }
}