class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       for(int i=0;i<4;i++){
        if(Arrays.deepEquals(mat,target))return true;
        rotate(mat);
       }
       return false;
    }
    public void rotate(int[][] mat){
        // transpose of a matrix
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat.length;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        // reversing each row
        for(int i=0;i<mat.length;i++){
            int left=0;
            int right=mat.length-1;
            while(left<right){
                int t=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=t;
                left++;
                right--;
            }
        }
    }
}