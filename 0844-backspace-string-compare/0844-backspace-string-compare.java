class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        while(i>=0||j>=0){
            i=validindex(s,i);
            j=validindex(t,j);
            if(i>=0&&j>=0&&s.charAt(i)!=t.charAt(j))return false;
            if((i>=0)!=(j>=0))return false;
            i--;
            j--;
        }
        return true;
    }
    public int validindex(String str,int index){
        int backspace=0;
        while(index>=0){
            if(str.charAt(index)=='#')backspace++;
            else if(backspace>0)backspace--;
            else break;
            index--;
        }
        return index;

    }
}