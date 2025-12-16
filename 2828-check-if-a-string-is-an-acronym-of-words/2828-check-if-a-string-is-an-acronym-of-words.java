class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str1=new StringBuilder();
       for (String str : words) {
    str1.append(str.charAt(0));
       } 
        return str1.toString().equals(s);
    }
}
