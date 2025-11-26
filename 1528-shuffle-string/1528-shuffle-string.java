class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder();
        char[] arr=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
            
        }
        str.append(arr);
        return str.toString();
    }
}