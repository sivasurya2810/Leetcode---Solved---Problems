class Solution {
    public int minElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int a:nums){
            l.add(a);
        }
        List<Integer>l1=new ArrayList<>();
        for(int b:l){
            int sum=0;
            while(b>0){
                sum+=b%10;
                b/=10;
            }
            l1.add(sum);
        }
        return Collections.min(l1);
    }
}