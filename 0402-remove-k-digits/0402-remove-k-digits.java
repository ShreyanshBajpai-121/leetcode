class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(st.size()>0&&k>0&&num.charAt(i)-'0'<st.peek()-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(st.size()>0) sb.append(st.pop());
        sb.reverse();
        while(sb.length()>0&&sb.charAt(0)=='0'){
        sb.deleteCharAt(0);
        }
        if(sb.length()==0)return"0";
        return sb.toString();
    }
}