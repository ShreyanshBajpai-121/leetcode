class Solution {
    public boolean isAnagram(String s, String t) {
    //    int []arr=new int[26];
    //    if(s.length()!=t.length())return false;
    //    for(int i=0;i<s.length();i++){
    //     char ch=s.charAt(i);
    //     arr[ch-'a']++;
    //    }
    //    for(int i=0;i<t.length();i++){
    //     char ch=t.charAt(i);
    //     arr[ch-'a']--;
    //     if(arr[ch-'a']<0) return false;
    //    }
    //     return true;
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            int f=map.get(ch);
            map.put(ch,f+1);

        }else{
            map.put(ch,1);
        }
    }
    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        if(!map.containsKey(ch)) return false;
        int f=map.get(ch)-1;
        if(f==0) map.remove(ch);
        else
        map.put(ch,f);
    }
    return map.isEmpty();
    
    }
}