class Solution {
    public int firstUniqChar(String s) {
        List<Character>l=new ArrayList<>();
        for(char a:s.toCharArray()){
            l.add(a);
        }
        for(int i=0;i<l.size();i++){
            if(l.indexOf(l.get(i))==l.lastIndexOf(l.get(i))){
                return i;
            }
        }
        return -1;
    }
}