class Solution {
    public int majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int a:nums){
            l.add(a);
        }
        Set<Integer>s=new HashSet<>(l);
        List<Integer>l1=new ArrayList<>(s);

        int mf=0;
        int me=0;
        for(int b:l1){
            int count=Collections.frequency(l,b);
            if(count>mf){
                mf=count;
                me=b;
            }
        }
        return me;
    }
}