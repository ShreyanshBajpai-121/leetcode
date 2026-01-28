class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
              image[i] = reverse(image[i]); 
        }
        return image;

    }
    static int[] reverse(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int t=arr[left]^1;
            arr[left]=arr[right]^1;
            arr[right]=t;
            left++;
            right--;
        }
        return arr;
    }
}