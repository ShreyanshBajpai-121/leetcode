class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int correct=mid+1;
            int missing=arr[mid]-correct;
            if(missing>=k)end=mid-1;
            else st=mid+1;
        }
        return end+1+k;
    }
}