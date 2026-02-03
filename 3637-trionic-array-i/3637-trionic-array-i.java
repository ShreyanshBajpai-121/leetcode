class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<3)return false;
        int s=0;
        for(int i=0;i<n-1;i++){
            if(s==0){
                if(nums[i]<nums[i+1]){

                }else if(i>0&&nums[i]>nums[i+1]){
                    s=1;
                }else return false;
            }else if(s==1){
                if(nums[i]>nums[i+1]){

                }else if(nums[i]<nums[i+1]){
                    s=2;
                }else return false;
            }else{
                if(nums[i]<nums[i+1]){

                }else return false;
            }
        }
        return s==2;
    }
}