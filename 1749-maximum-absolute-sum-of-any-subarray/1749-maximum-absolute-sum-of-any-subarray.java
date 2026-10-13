class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
       for(int i=0;i<nums.length;i++){
        currsum+=nums[i];
        maxsum=Math.max(maxsum,currsum);
        if(currsum<0)currsum=0;
       }
       currsum=0;
       int minsum=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        currsum+=nums[i];
        minsum=Math.min(minsum,currsum);
        if(currsum>0)currsum=0;
       }
       int ans=Math.abs(minsum);
       if(maxsum>ans)return maxsum;
       return ans;
    }
}