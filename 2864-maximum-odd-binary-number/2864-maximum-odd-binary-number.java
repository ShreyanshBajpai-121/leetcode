class Solution {
    public String maximumOddBinaryNumber(String str) {
        char[]ch=str.toCharArray();
        int n=str.length();
        int s=0;
        int e=n-1;
        while(s<=e){
            
            if(ch[e]=='0')e--;
           else if(ch[s]=='1')
           s++;
          else if(ch[s]=='0'&&ch[e]=='1'&&s<e){
                char ch1=ch[s];
                ch[s]=ch[e];
                ch[e]=ch1;
                s++;
                e--;
            }
            
        }
        char ch1=ch[e];
        ch[e]=ch[n-1];
        ch[n-1]=ch1;
        return new String(ch);
    }
}