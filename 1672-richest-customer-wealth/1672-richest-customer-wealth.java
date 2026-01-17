class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int rs=0;
        for(int r=0;r<accounts.length;r++){
            for(int c=0;c<accounts[r].length;c++){
                rs+=accounts[r][c];
            }
            if(rs>max){
                max=rs;
            }
            rs=0;
        }
        return max;
    }
}