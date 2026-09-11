class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        mp.put(0,1);
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           int rem = ((sum % k) + k) % k;
            if(mp.containsKey(rem)){
            c+=mp.get(rem);
            }
             mp.put(rem,mp.getOrDefault(rem,0)+1);
            
        }
        return c;

    }
}