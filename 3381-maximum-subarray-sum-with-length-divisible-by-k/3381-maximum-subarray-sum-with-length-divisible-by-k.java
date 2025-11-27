class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long prefix = 0;
        long result = Long.MIN_VALUE;

        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE / 2);
        minPrefix[k - 1] = 0;  // to handle subarrays starting at index 0

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            result = Math.max(result, prefix - minPrefix[i % k]);
            minPrefix[i % k] = Math.min(minPrefix[i % k], prefix);
        }

        return result;
    }
}
