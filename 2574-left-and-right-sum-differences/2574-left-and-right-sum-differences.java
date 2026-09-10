class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0;
       
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        for(int i=0;i<nums.length;i++){
        
        int right=sum-nums[i]-left;
       
        int original=nums[i];
      nums[i]=  Math.abs(right-left);
      left+=original;
        

    }
    return nums;
    }
}