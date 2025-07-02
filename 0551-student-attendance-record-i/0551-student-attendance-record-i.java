class Solution {
    public boolean checkRecord(String s) {
        int n=s.length();
        int count=0;
        int late=0;
        for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='A'){
            count++;
            if(count>=2)return false;
            late=0;
        }
        else if(s.charAt(i)=='L'){
            late++;
            if(late>=3)return false;
            
        }
        else{
            late=0;
        }
        return true;
    }
}