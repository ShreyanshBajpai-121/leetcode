class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int count=0;
            int j=i;
            while(j<n&&chars[j]==ch){
                count++;
                j++;
            }
        
                chars[idx++]=ch;
            if(count>1){
            
            String s=Integer.toString(count);
            for(char c:s.toCharArray()){
                chars[idx++]=c;
            }
            }
            i=j-1;
        }
        return idx;
    }
}