class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
       int st=1;
       int end=num;
       while(st<=end){
        int mid=st+(end-st)/2;
        long sq=(long)mid*mid;
        if(sq==num)return true;
        else if(sq>num)end=mid-1;
        else st=mid+1;
       } 
       return false;
    }
}