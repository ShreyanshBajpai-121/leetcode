class Solution {
    public String reversePrefix(String word, char ch) {
        int l = word.indexOf(ch);
        if(l==-1){
            return word;
        }
        StringBuilder sb=new StringBuilder(word.substring(0,l+1));
        sb.reverse();
        sb.append(word.substring(l+1));
        return sb.toString();
    }
}