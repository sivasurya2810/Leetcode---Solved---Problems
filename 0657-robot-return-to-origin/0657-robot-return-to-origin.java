class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;int j=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')j++;
            if(ch=='D')j--;
            if(ch=='R')i++;
            if(ch=='L')i--;
        }
        if(i==0 && j==0){
            return true;
        }
        return false;
    }
}