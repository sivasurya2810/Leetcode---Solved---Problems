class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int sum=0;

        for(int a:nums){
            while(a>0){
                count++;
                a/=10;
            }
            if(count%2==0){
                sum++;
            }
            count=0;

        }
        return sum;
    }
}