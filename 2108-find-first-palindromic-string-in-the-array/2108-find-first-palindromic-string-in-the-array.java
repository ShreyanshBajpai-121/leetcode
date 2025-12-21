class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
         String s=words[i];
         String reverse=new StringBuilder(s).reverse().toString();
         if(s.equals(reverse)){
            return s;
         }
    }
    return"";
}
}