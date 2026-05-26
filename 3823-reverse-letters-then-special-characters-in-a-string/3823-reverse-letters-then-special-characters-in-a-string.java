class Solution {
    public String reverseByType(String s) {
        StringBuilder sb=new StringBuilder(s);
        int left=0;
        int right=sb.length()-1;
        while(left<right){
            char ch=sb.charAt(left);
            char ch1=sb.charAt(right);
            if(Character.isLetter(ch)&&Character.isLetter(ch1)){
                sb.setCharAt(left, ch1);
                sb.setCharAt(right, ch);
                left++;
                right--;
            }else if(!Character.isLetter(ch1)) right--;
            else left++;
        }
        left=0;
        right=sb.length()-1;

         while(left<right){
            char ch=sb.charAt(left);
            char ch1=sb.charAt(right);
            if(!Character.isLetter(ch)&&!Character.isLetter(ch1)){
                sb.setCharAt(left, ch1);
                sb.setCharAt(right, ch);
                left++;
                right--;
            }else if(Character.isLetter(ch1)) right--;
            else left++;
        }

        return sb.toString();
    }
}