class Solution {
    public int[] dailyTemperatures(int[] h) {
        int n=h.length;
        int[]arr=new int[h.length];
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=n-1;i>=0;i--){
            while(st.size()>0&&h[i]>=h[st.peek()]){
                st.pop();
                
            }
            if(st.size()==0)arr[i]=0;
            else{
            arr[i]=st.peek()-i;
            c=0;
            }
            st.push(i);
        }
        return arr;
    }
}