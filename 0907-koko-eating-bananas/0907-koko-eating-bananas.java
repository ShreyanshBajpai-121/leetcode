class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = maxElement(piles);

        while (st <= end) {
            int mid = st + (end - st) / 2;
            long tothrs = calcHours(piles, mid); 

            if (tothrs <= h)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return st;
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }

    public static long calcHours(int[] piles, int k) {
        long hours = 0;
        for (int bananas : piles) {
            hours += (bananas + k - 1) / k;  
        }
        return hours;
    }
}
