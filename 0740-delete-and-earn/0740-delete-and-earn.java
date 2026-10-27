class Solution {
    public int deleteAndEarn(int[] nums) {

     int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] arr = new int[max + 1];

        for (int x : nums) {
            arr[x] += x;
        }
        return f(arr);
    }
    static int f(int[]arr){
       int prev=arr[0];
       int prev2=0;
       for(int i=1;i<arr.length;i++){
        int pick=arr[i];
        if(i>1)pick+=prev2;
        int notpick=0+prev;
        int curri=Math.max(pick,notpick);
        prev2=prev;
        prev=curri;
       }
       return prev;
    }
}