class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
       StringBuilder compl=new StringBuilder();
       String s=binconv(n);
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1')compl.append(0);
        else compl.append(1);
       }
       return Integer.parseInt(compl.toString(),2);
    }
    public String binconv(int n){
        StringBuilder bin=new StringBuilder();
        while(n>0){
            bin.append(n%2);
            n=n/2;
        }
        return bin.reverse().toString();
    }
}