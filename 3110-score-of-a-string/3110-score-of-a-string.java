class Solution {
    public int scoreOfString(String s) {
        List<Integer>l=new ArrayList<>();
        
        for(int i=0;i<s.length()-1;i++){
               int a=s.charAt(i)-s.charAt(i+1);
                int c=Math.abs(a);
                l.add(c);
            
        }
        int sum=0;
        for(int b:l){
            sum+=b;
        }
        return sum;
    }
}