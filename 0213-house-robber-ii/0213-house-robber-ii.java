class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[]arr1=new int[n];
        int[]arr2=new int[n];
        for(int i=0;i<n;i++){
            if(i!=0)arr1[i]=nums[i];
            if(i!=n-1)arr2[i]=nums[i];
        }
        return  Math.max(robs(arr1),robs(arr2));
    }
     public int robs(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
         return f(n-1,nums,dp);
         
    }
    static int f(int i,int[]arr,int[]dp){
        if(i==0)return arr[i];
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];
        int pick=arr[i]+f(i-2,arr,dp);
        int notpick=0+f(i-1,arr,dp);
        return dp[i]=Math.max(pick,notpick);
    }
}