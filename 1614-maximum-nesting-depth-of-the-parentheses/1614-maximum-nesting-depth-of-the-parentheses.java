class Solution {
    public int maxDepth(String s) {
        int currdepth=0;
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currdepth++;
                maxdepth=Math.max(currdepth,maxdepth);
            }
            else if(ch==')'){
                currdepth--;
            }
        }
        return maxdepth;
    }
}