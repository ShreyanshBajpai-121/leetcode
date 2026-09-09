class Solution {
    public int pivotInteger(int n) {
       int sum=0;
       sum=(n*(n+1)/2);
       int left=0;
       for(int i=1;i<=n;i++){
        int right=sum-i-left;
        if(left==right)return i;
        left+=i;
       } 
       return -1;
    }
}