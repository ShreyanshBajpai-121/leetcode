class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String word=strs[i];
            String neww=generate(word);
            map.computeIfAbsent(neww,k->new ArrayList<>()).add(word);
        }result.addAll(map.values());
        return result;
}
private String generate(String wrd){
    int[]f=new int[26];
    for(char c:wrd.toCharArray()){
        f[c-'a']++;
    }
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<26;i++){
        sb.append('#');
        sb.append(f[i]);
    }
    return sb.toString();
}
}