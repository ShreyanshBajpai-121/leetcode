class Solution {
    public int subtractProductAndSum(int n) {
        int pr=1;
        int sum=0;
        while(n>0){
            int r=n%10;
            pr=pr*r;
            sum+=r;
            n/=10;
        }
        return pr-sum;
    }
}