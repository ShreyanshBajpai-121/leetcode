class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int right=(i-startIndex+n)%n;
                int left=(startIndex-i+n)%n;
                min=Math.min(min,(Math.min(right,left)));
            }
        }
        if(min==Integer.MAX_VALUE)return -1;
        return min;
    }
}