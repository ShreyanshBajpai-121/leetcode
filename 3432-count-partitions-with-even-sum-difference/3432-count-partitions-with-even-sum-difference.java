class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int left=0;
        int c=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        for(int i=0;i<nums.length-1;i++){
            int right=sum-nums[i]-left;
            left+=nums[i];
            if((right-left)%2==0)c++;
        }
        return c;
    }
}