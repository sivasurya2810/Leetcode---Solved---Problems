class Solution {
    public int thirdMax(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int a:nums){
            l.add(a);
        }
        Set<Integer>s=new LinkedHashSet<>(l);
        List<Integer>l1=new ArrayList<>(s);
        Collections.sort(l1);
        Collections.reverse(l1);
        if(l1.size()<3){
            return l1.get(0);
        }
        return l1.get(2);
    }
}