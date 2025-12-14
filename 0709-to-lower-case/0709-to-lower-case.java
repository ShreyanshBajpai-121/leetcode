class Solution {
    public String toLowerCase(String s) {
        StringBuilder s2=new StringBuilder();
        char ch2;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
           ch2=Character.toLowerCase(ch);
        s2.append(ch2);
            }
            else{
                s2.append(ch);
            }
    }
    return s2.toString();
}
}