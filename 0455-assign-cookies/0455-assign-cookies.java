class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int l=0;
        int r=0;
        while(l<m&&r<n){
            if(g[l]<=s[r]){
            r=r+1;
            l=l+1;
            c++;
            }else
            r=r+1;
        }
        return c;
    }
}