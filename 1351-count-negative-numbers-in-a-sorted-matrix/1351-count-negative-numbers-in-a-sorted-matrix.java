class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            c+=count(grid[i]);
        }
        return c;
        
    }
    static int count(int[]arr){
        int l=0;
        int h=arr.length;
        while(l<h){
        int mid=l+(h-l)/2;
        if(arr[mid]<0){
         h=mid;
        }
        else {
            l=mid+1;
        }
    }
    return arr.length-l;
}
}