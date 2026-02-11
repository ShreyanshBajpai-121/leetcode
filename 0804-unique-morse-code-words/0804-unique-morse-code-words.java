class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String[] arr = {
    ".-","-...","-.-.","-..",".","..-.","--.","....","..",
    ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-","-.--","--.."
};

HashSet<String> set = new HashSet<>();
StringBuilder str=new StringBuilder();
for(int i=0;i<words.length;i++){
    str.setLength(0);
    String s=words[i];
    for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        int idx=ch-97;
        str.append(arr[idx]);
    }
    set.add(str.toString());
}
return set.size();

    }
}