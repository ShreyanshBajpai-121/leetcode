class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
       int j=i+1;
       int k=n-1;
       while(j<k){
        int pr=nums[i]*nums[j]*nums[k];
       if(max<pr){
        max=pr;
        k--;
       }else j++;
        j++;
        k--;
       }
        }
        return max;
    }
}