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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public static TreeNode build(int plo,int phi,int inlo,int inhi,int[] ino,int post[]){
        if(plo>phi||inlo>inhi) return null;
        int val=post[phi];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inlo;i<=inhi;i++){
            if(ino[i]==val){
            r=i;
            break;
        }
        }
        int cnt=r-inlo;
        root.left=build(plo,plo+cnt-1,inlo,r-1,ino,post);
        root.right=build(plo+cnt,phi-1,r+1,inhi,ino,post);
        return root;

    }
}