class Solution {
    public boolean judgeCircle(String moves) {
        int c=0,c1=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
            c++;
            if(moves.charAt(i)=='D')
            c--;
            if(moves.charAt(i)=='L')
            c1++;
            if(moves.charAt(i)=='R')
            c1--;
        }
        if(c==0&&c1==0)
        return true;

        return false;
    }
}