class Solution {
    public int[][] generateMatrix(int n) {
        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=n-1;
        int count=1;
        int[][]arr=new int[n][n];
        while(sr<=er&&sc<=ec){
            //top
            for(int j=sr;j<=ec;j++){
                arr[sr][j]=count++;
            }
            //right
            for(int j=sr+1;j<=er;j++){
                arr[j][ec]=count++;
            }
            //bottom
            for(int j=ec-1;j>=sr;j--){
                arr[er][j]=count++;
            }
            //left
            for(int j=er-1;j>=sr+1;j--){
                arr[j][sc]=count++;
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return arr;
    
    }
}