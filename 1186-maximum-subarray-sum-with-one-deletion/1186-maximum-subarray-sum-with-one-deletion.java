class Solution {
    public int maximumSum(int[] arr) {
       int keep=arr[0];
       int delete=0;
       int maxsum=arr[0];

       for(int i=1;i<arr.length;i++){
       delete=Math.max(keep,delete+arr[i]);
        keep=Math.max(arr[i],keep+arr[i]);
       maxsum=Math.max(maxsum,Math.max(delete,keep));
      
       }
       return maxsum;
    }
}