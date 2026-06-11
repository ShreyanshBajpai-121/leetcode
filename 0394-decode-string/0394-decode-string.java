class Solution {
    int i=0;
    public String decodeString(String s) {
        StringBuilder ans=new StringBuilder();
        int n=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }else if(ch=='['){
                i++;
                String finals=decodeString(s);
            while(n>0){
            ans.append(finals);
            n--;
            }
        n=0;
        }
        else if(ch==']'){
            return ans.toString();
        }else{
            ans.append(ch);
        }
        i++;
        }
        return ans.toString();


    }
}