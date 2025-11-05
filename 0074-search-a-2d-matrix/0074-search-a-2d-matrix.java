class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=0;
        int end=m*n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midele=matrix[mid/m][mid%m];
            if(midele==target) return true;
            if(midele<target) st=mid+1;
            else
            end=mid-1;
        }
        return false;
    }
}