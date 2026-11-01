class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int i=n-2;
        while(i>=0&&arr[i]>=arr[i+1])i--;
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        int k=i+1;
        int p=n-1;
        while(k<p){
            int t=arr[k];
            arr[k]=arr[p];
            arr[p]=t;
            k++;
            p--;
        }

    }
}