class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int currsum = 0;
        
        int totalsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
 for(int i=0;i<nums.length;i++){
    totalsum+=nums[i];
 }
 for(int i=0;i<nums.length;i++){
    currsum+=nums[i];
    minSum=Math.min(minSum,currsum);
    if(currsum>0)currsum=0;

 }
  int max = Integer.MIN_VALUE;
    
    currsum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      currsum += nums[i];
      maxSum = Math.max(maxSum, currsum);
      if (currsum < 0)
        currsum = 0;


    }
    if(maxSum<0)return maxSum;
 return Math.max(maxSum,totalsum-minSum);
      
    }
}