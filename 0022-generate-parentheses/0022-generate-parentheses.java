class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(list,"",0,0,n);
        return list;
    }
    void helper(List<String> list,String curr,int op,int cl,int max){
  if(curr.length()==max*2){
    list.add(curr);
    return;
  }if(op<max){
    helper(list,curr+"(",op+1,cl,max);
  }if(cl<op){
    helper(list,curr+")",op,cl+1,max);
  }
    }
}