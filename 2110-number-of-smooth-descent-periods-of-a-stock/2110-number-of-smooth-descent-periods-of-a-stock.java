class Solution {
    public long getDescentPeriods(int[] prices) {
      long count=1;
      long countsum=0;
      for(int i=1;i<prices.length;i++){
        if(prices[i-1]-prices[i]==1){
            count+=1;
        }else{
            count=1;
        }
        countsum+=count;

      }
      return countsum+1;
        }
    }
