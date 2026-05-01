class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdividing(i))
            list.add(i);
        }
        return list;
    }
        public boolean selfdividing(int num){
        int dupnum=num;
        while(dupnum>0){
            int r=dupnum%10;
            if(r==0||num%r!=0)return false;
            dupnum/=10;
        }
        return true;
    }
}