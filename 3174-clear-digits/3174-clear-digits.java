class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(Character.isLetter(ch)){
            st.push(ch);
        }else{
            if(!st.isEmpty())
            st.pop();
        }
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    
}
}