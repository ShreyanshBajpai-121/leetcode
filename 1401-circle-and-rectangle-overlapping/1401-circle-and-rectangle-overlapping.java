class Solution {
    public boolean checkOverlap(int radius, int xcenter, int ycenter, int x1, int y1, int x2, int y2) {
       int closestx=0;
       int closesty=0;
       if(xcenter<x1)closestx=x1;
       else if(xcenter>x2)closestx=x2;
       else closestx=xcenter;
       if(ycenter<y1)closesty=y1;
       else if(ycenter>y2)closesty=y2;
       else closesty=ycenter;
       int x=(xcenter-closestx)*(xcenter-closestx);
       int y=(ycenter-closesty)*(ycenter-closesty);
       if(x+y<=radius*radius)return true;
       return false;
    }
}