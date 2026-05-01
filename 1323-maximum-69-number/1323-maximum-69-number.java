class Solution {
    public int maximum69Number (int nums) {
       ArrayList<Integer> list=new ArrayList<>();
       int num=nums;
       while(num>0){
        list.add(num%10);
        num/=10;
       }
       Collections.reverse(list);
       for(int i=0;i<list.size();i++){
        if(list.get(i)==6){
            list.set(i,9); break;
        }
       }
       int org=0;
       for(int ele:list){
        org=org*10+ele;
       }
       return org;
    }
}