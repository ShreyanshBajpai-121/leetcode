class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d=s+s;
        if(d.substring(1,d.length()-1).contains(s))
         return true;
    return false;
    }
}