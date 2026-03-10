class Solution {
    public int mostWordsFound(String[] sentences) {
        List<Integer>l=new ArrayList<>();
        
        for(String a:sentences){
            int count=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==' '){
                    count++;
                }
            }
            l.add(count);
        }
        return Collections.max(l)+1;
    }
}