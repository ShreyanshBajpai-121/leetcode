class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]ans=new int[2];
        int fo=-1;
        int lo=-1;
        int st=0;
        int n=nums.length;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                fo=mid;
                end=mid-1;
            }
            else if(target<nums[mid]) end=mid-1;
            else st=mid+1;
        }
        st=0;
        end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                lo=mid;
                st=mid+1;
            }
            else if(target<nums[mid]) end=mid-1;
            else st=mid+1;
        }

        ans[0]=fo;
        ans[1]=lo;
        return ans;

    }
}