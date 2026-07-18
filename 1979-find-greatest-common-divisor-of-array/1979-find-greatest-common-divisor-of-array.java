class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(small>nums[i])small=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(max<nums[i])max=nums[i];
        }
         while (max != 0) {
            int temp = max;
            max = small % max;
            small = temp;
        }
        return small;
    }
}