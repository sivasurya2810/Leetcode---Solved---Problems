class Solution {
    public void reverseString(char[] s) {
        List<Character>l=new ArrayList<>();
        for(char a:s){
            l.add(a);
        }
        Collections.reverse(l);
        for(int i=0;i<s.length;i++){
            s[i]=l.get(i);
        }
    }
}