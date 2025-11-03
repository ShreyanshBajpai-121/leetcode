class Solution {
    public int search(int[] nums, int target) {
        int idx=-1;
        int st=0;
        int n=nums.length;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<nums[end]){
               if(target>nums[mid]&&target<=nums[end]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }else{
             if(target<nums[mid] && target>=nums[st]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        }
        return -1;
    }

}