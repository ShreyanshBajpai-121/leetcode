class Solution {
    public int totalMoney(int n) {
      int weekcount=n/7;
      int remdays=n%7;
      int total=((weekcount*(weekcount-1))/2)*7;
      total+=28*weekcount;
      total+=((remdays*(remdays+1))/2)+(weekcount*remdays);
       return total;
    }
}