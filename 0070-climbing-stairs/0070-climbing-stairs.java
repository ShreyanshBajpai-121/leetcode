class Solution {
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
      return f(n,dp);
    }
    public int f(int i,int[]dp){
        if(i<=1)return 1;
        if(dp[i]!=-1)return dp[i];
        int b=0;
        
       int a=f(i-1,dp);
       if(i>1)
       b=f(i-2,dp);
       return dp[i]=a+b;
    }
}