class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
          
            if(s.charAt(left)==s.charAt(right)){
            left++;
            right--;
            }else{
                return palin(s, left + 1, right) ||
                       palin(s, left, right - 1);
            }
        }
        return true;
    }
        public boolean palin(String str,int left,int right){
            while(left<right){
                 if(str.charAt(left)!=str.charAt(right))return false;
            left++;
            right--;
            }
            return true;
        }
    }
