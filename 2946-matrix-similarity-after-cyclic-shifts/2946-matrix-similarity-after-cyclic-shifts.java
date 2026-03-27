class Solution {
    public boolean areSimilar(int[][] mat, int k) {
       int m=mat.length;
       int n=mat[0].length;
       int k1=k%n;
       int[][] copy = new int[m][n];

// copy original
for(int i = 0; i < m; i++){
    for(int j = 0; j < n; j++){
        copy[i][j] = mat[i][j];
    }
}
       for(int i=0;i<m;i++){
        reverse(mat[i],0,k1-1);
        reverse(mat[i],k1,n-1);
        reverse(mat[i],0,n-1);
       }
       if(Arrays.deepEquals(copy,mat)) return true;
       return false;

}
public void reverse(int[]arr,int left,int right){
    while(left<right){
        int t=arr[left];
        arr[left]=arr[right];
        arr[right]=t;
        left++;
        right--;
    }
}
}