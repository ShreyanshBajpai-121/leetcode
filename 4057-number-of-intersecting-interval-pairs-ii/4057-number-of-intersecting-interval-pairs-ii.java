class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
         int n=intervals.length;
        long cnt=0;
        for(int i=0;i<n;i++){
            while(!pq.isEmpty()&&pq.peek()<intervals[i][0]) pq.poll();
            
                cnt+=pq.size();
            pq.add(intervals[i][1]);
            
        }
        return cnt;
    }
}