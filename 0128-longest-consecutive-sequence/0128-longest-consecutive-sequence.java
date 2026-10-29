class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int max=0;
       
        for(int x:st){
            if(!st.contains(x-1)){
             int c=1;
        while(st.contains(x+1)){
            c++;
            x++;
        }
        max=Math.max(c,max);
            }
        }
        return max;
    }
}