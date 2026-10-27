class Solution {
    public int rob(int[] nums) {
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