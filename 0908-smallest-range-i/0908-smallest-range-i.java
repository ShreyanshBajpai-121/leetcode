class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int val:nums){
            if(val<min)min=val;
            if(val>max)max=val;
        }
     if((min+k)>(max-k)) return 0;
     else
     return (max-k)-(min+k);

    }
}