class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      Set<Character> st=new HashSet<>();
      for(int i=0;i<allowed.length();i++){
        st.add(allowed.charAt(i));
      }
      int count=0;
      for(String wrd:words){
        int flag=1;
        for(int i=0;i<wrd.length();i++){
            if(!st.contains(wrd.charAt(i))){
                flag=0;
                break;
            }
        }
        count+=flag;
        }
        return count;
    }
}