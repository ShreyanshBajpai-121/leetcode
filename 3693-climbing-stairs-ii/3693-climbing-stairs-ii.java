class Solution {
    public int climbStairs(int n, int[] costs) {
        int[]dp=new int[n+1];
         for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return f(n,costs,dp);
    }
    static int f(int i,int []arr,int[]dp){
        if(i==0)return 0;
        if(dp[i]!=-1)return dp[i];
         int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;

        if(i>=1)
         a=f(i-1,arr,dp)+(arr[i-1]+1);
        if(i>=2)
         b=f(i-2,arr,dp)+(arr[i-1]+4);
        if(i>=3)
         c=f(i-3,arr,dp)+(arr[i-1]+9);
        return dp[i]=Math.min(a,Math.min(b,c));
    }
}