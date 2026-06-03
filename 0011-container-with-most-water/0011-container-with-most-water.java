class Solution {
    public int maxArea(int[] height) {
      int max=Integer.MIN_VALUE;
     int left=0;
     int right=height.length-1;
     while(left<right){
        int w=right-left;
        int h=Math.min(height[left],height[right]);
        max=Math.max(max,(w*h));
        if(height[left]>height[right])right--;
        else left++;
     }
      return max;  
    }
}