class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return goal(nums,k)-goal(nums,k-1);
    }
        public int goal(int[]nums,int k){
        int count=0;
        int left=0;
        int oddc=0;

        for(int right=0;right<nums.length;right++){
          int digit=nums[right];
          if(digit%2!=0)oddc++;
          while(oddc>k){
            if(nums[left]%2!=0)
            oddc--;
            left++;
          }
          count+=right-left+1;
        }
        return count;
    }
}