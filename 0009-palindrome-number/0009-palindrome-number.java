class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        String b=sb.toString();
        if(b.equals(a)){
            return true;
            }
            else{
                return false;
            }

        
    }
}