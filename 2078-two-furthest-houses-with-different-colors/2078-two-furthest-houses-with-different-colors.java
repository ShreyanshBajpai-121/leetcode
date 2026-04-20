class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        int n=colors.length;
        int i=0;
        while(i<n){
            if(colors[0]!=colors[i]){
                max=Math.max(max,i);
            }if(colors[i]!=colors[n-1]){
                max=Math.max(max,n-1-i);
                }
                i++;
        }
        return max;
    }
}