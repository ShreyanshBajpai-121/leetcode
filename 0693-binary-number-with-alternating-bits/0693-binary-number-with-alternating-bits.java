class Solution {
    public boolean hasAlternatingBits(int n) {
       StringBuilder bin=new StringBuilder();
       while(n>0){
        bin.append(n&1);
        n=n>>1;
       } 
       bin.reverse();
       for(int i=0;i<bin.length()-1;i++){
        if(bin.charAt(i)==bin.charAt(i+1)){
            return false;
        }
       }
       return true;
    }
}