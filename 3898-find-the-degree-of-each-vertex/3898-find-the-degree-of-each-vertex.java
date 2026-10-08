class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[]arr=new int[n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
          if(matrix[i][j]==1)c++;
            }
            arr[i]=c;
            c=0;
        }
        return arr;
    }
}