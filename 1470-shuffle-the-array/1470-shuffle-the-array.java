class Solution {
    public int[] shuffle(int[] nums, int n) {
      for(int i=1;i<=nums.length;i=i+2){
        for(int j=n;j>i;j--){
            int t=nums[j];
            nums[j]=nums[j-1];
            nums[j-1]=t;
        }
        n=n+1;
      }
      return nums;
    }
}
/*int[] arr=new int[nums.length];
int index=0;
for(int i=0;i<nums.length;i++){
    arr[index]=nums[i];
    index+=1;
    arr[index]=nums[i+n];
    index+=1;
}
*/