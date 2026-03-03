class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int c=0;
        for(int a:nums){
            if(a!=0){
                l.add(a);
            }
            else{
                c++;
            }
        }
        for(int i=0;i<c;i++){
            l.add(0);
        }
       
        for(int i=0;i<l.size();i++){
            nums[i]=l.get(i);
        }
       

    }
}