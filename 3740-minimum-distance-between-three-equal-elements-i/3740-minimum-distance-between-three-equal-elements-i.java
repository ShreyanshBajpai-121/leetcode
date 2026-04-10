class Solution {
    public int minimumDistance(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        if(n<=2)return -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]==nums[j]){
                            ans=Math.min(ans,2*(k-i));
                        }
                    }
                }
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        else return ans;
    }
}