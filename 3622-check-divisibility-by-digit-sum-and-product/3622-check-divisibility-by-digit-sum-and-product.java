class Solution {
    public boolean checkDivisibility(int n) {
        int pr=1;
        int sum=0;
        int n1=n;
        while(n1>0){
            int r=n1%10;
            sum+=r;
            pr*=r;
            n1/=10;
        }
         if(n%(pr+sum)==0)return true; 
         return false;
    }
}