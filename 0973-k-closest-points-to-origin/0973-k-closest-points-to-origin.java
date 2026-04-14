class Triplet implements Comparable<Triplet>{
    int distt;
    int x;
    int y;
    Triplet(int distt,int x,int y){
        this.distt=distt;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t){
        return this.distt-t.distt;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
     PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
     for(int[]point:points){
        int x=point[0];
        int y=point[1];
        int distt=x*x+y*y;
        pq.add(new Triplet(distt,x,y));
        if(pq.size()>k)pq.remove();
     }   
     int[][]ans=new int[k][2];
     for(int i=0;i<k;i++){
        Triplet top=pq.remove();
        ans[i][0]=top.x;
        ans[i][1]=top.y;
     }
     return ans;
    }
}