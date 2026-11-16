class Solution {
    public int tribonacci(int n) {
        int[]dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return t(n,dp);
    }
    static int t(int i,int[]dp){
        if(i<1)return i;
       else if(i==1||i==2)return 1;
       if(dp[i]!=-1)return dp[i];
       return dp[i]=t(i-1,dp)+t(i-2,dp)+t(i-3,dp);
    }
}