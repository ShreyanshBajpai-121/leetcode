class Solution {
    public long removeZeros(long n) {
        String str=Long.toString(n);
       String str1=str.replace("0", "");
        
        long num = Long.parseLong(str1);
        return num;
    }
}