class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] m=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            m[i]=nums[i]*nums[i];
        }
        Arrays.sort(m);
        return m;
    }

}