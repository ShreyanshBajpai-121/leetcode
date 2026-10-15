class Solution {
    public int evalRPN(String[] arr) {
        Stack<String>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
     
       if(arr[i].equals("+")){
        int a=Integer.parseInt(st.pop());
        int b=Integer.parseInt(st.pop());
        st.push(String.valueOf(a+b));
       }
       else if(arr[i].equals("-")){
         int a=Integer.parseInt(st.pop());
        int b=Integer.parseInt(st.pop());
        st.push(String.valueOf(b-a));
       }
       else if(arr[i].equals("*")){
         int a=Integer.parseInt(st.pop());
        int b=Integer.parseInt(st.pop());
        st.push(String.valueOf(a*b));
       }
       else if(arr[i].equals("/")){
         int a=Integer.parseInt(st.pop());
        int b=Integer.parseInt(st.pop());
        st.push(String.valueOf(b/a));
       }
       else{
        st.push(arr[i]);
       }
        }
        return Integer.parseInt(st.pop());
    }
}