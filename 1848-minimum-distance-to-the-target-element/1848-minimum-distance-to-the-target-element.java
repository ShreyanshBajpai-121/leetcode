class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                 c=Math.abs(i-start);
                min=Math.min(min,c);
            }
        }
        return min;
    }
}