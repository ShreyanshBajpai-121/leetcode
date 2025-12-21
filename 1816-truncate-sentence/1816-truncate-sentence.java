class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int st = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    sb.append(s.substring(st, i));
                    return sb.toString();
                }
            }
        }
        return s;
}
}
