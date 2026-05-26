class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int len=word.length()-1;
        int count=0;
        for(int i=0;i<=len;i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)) set1.add(ch);
            else set2.add(ch);
            
        }

        for(char ch : set1) {

    if(set2.contains(Character.toUpperCase(ch))) {
        count++;
    }
}
return count;
    }
}