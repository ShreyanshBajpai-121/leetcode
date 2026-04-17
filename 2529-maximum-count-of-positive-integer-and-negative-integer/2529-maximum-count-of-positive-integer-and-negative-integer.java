class Solution {
    public int maximumCount(int[] arr) {
        int st=0;
        int n=arr.length;
        int end=n-1;
        int cneg=-1;
        //negative count
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>=0) {
                end=mid-1;
            }
            else {
                cneg=mid;
            st=mid+1;

        }
       
        }
        int cpos=n;
        //postive count;
        st=0;
        end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<=0) {
                st=mid+1;;
            }
            else {
                cpos=mid;
            end=mid-1;

       }
    }
    return Math.max(cneg+1,n-cpos);
}
}