class Solution {
    public int heightChecker(int[] heights) {
        int l=heights.length;
        int[]ex=heights.clone();
        
        Arrays.sort(ex);
        int c=0;
        for(int i=0;i<l;i++){
       if(heights[i]!=ex[i])c++;
        }
        return c;
    }
}