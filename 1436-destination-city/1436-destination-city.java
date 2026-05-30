class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> st=new HashSet<>();
        for (List<String> path : paths) {
          st.add(path.get(0));
        }
        for (List<String> pa : paths) {
            String dest=pa.get(1);
            if(!st.contains(dest))
            return dest;
    }
    return "";
    }
}