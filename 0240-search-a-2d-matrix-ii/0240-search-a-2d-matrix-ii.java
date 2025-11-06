class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=0;
        int end=m-1;
        while(st<n&&end>=0){
            if(matrix[st][end]==target) return true;
                if(target<matrix[st][end]) end--;
                else st++;
            }
                  return false;
        }
  

    }
