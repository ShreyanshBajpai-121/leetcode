class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
       int left=0;
       int c=0;
       int pr=1;
       for(int right=0;right<nums.length;right++){
        pr*=nums[right];
        while(pr>=k){
            pr/=nums[left];
            left++;
        }
        c+=right-left+1;
       }
       return c;
    }
}