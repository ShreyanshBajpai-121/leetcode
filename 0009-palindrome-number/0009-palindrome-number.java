class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        int p;
        while(x>0)
        {
            p=x%10;
         rev=(rev*10)+p;
         x=x/10;
        }
        if(rev==n)
return true;
else
return false;
    }
}