class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] ans=new int[2];
         int c=0;
  HashMap<Integer,Integer>mp=new HashMap<>();
for(int x:nums){
    int comp=target-x;
    if(mp.containsKey(comp)){
        ans[0]=c;
        ans[1]=mp.get(comp);
        return ans;
    }
    mp.put(x,c);
    c++;
}
return ans;
       
    }
}