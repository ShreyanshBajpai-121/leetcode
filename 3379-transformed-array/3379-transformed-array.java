class Solution {
    public int[] constructTransformedArray(int[] nums) {
       int n=nums.length;
       int[] arr=new int[n];
    for(int i=0;i<nums.length;i++){
        int s=nums[i];
        int k=(s+i)%n;
    
    if(k<0){
        k+=n;
    }
    arr[i]=nums[k];
    }
    return arr;
}
}