class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
    int m=mat.length;
    int n=mat[0].length;
    int srow=0;
    int erow=m-1;
    int scol=0;
    int ecol=n-1;
    List<Integer> list=new ArrayList<>();
while(srow<=erow&&scol<=ecol){
    //top
    for(int j=srow;j<=ecol;j++){
        list.add(mat[srow][j]);
    }
    //right
    for(int i=srow+1;i<=erow;i++){
        list.add(mat[i][ecol]);
    }
    //bottom
    for(int j=ecol-1;j>=srow;j--){
        if(srow==erow)break;
        list.add(mat[erow][j]);
    }
    //left
    for(int i=erow-1;i>=srow+1;i--){
        if(scol==ecol)break;
        list.add(mat[i][scol]);
    }
    srow++;
    scol++;
    erow--;
    ecol--;
    }
    return list;
    }
}