class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[]ha=new int[26];
        int[]pa=new int[26];
        List<Integer>ans=new ArrayList<>();
        int window=p.length();
        int left=0;
        int right=0;
        if(s.length()<window)return ans;
        while(right<window){
            pa[p.charAt(right)-'a']+=1;
            ha[s.charAt(right++)-'a']+=1;
        }
        right-=1;
          while(right<s.length()){
            if(Arrays.equals(pa,ha))
                ans.add(left);
                right+=1;
                if(right!=s.length())
                ha[s.charAt(right)-'a']+=1;
                ha[s.charAt(left)-'a']-=1;
                left+=1;
            
          }
          return ans;
          }
}