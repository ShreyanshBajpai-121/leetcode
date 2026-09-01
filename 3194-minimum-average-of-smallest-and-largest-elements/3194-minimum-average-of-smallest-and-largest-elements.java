class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        double avg=(nums[s]+nums[e])/2.0;
        while(s<=e){
             avg=Math.min(avg,((nums[s]+nums[e])/2.0));
            s++;
            e--;
        }
        return avg;
    }
}