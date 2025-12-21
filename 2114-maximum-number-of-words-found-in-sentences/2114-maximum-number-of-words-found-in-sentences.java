class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxword=0;
        for(String sentence:sentences){
            String[] words=sentence.split(" ");
            int count=words.length;
            if(count>maxword) maxword=count;
        }
        return maxword;
    }
}