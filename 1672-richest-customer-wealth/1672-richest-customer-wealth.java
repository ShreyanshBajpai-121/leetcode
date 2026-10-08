class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int m=accounts.length;
        int n=accounts[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
            sum=0;
        }
        return max;
    }
}