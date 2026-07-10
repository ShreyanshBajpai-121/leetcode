class Solution {
    public int maxProductDifference(int[] nums) {
        int[]ans=nums.clone();
        Arrays.sort(ans);
        int l=nums.length;
        int pr=ans[l-1]*ans[l-2];
       int hmm=ans[0]*ans[1];
        return pr-hmm;
    }
}