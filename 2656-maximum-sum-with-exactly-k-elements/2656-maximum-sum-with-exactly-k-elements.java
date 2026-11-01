class Solution {
    public int maximizeSum(int[] arr, int k) {
        int n=arr.length;
        int a=0;
int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }
     for(int i=0;i<k;i++){
         a+=max;
         max++;
     }
     return a;
    }
}