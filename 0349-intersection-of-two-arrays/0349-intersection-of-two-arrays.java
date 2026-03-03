class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        for(int a:nums1){
            s.add(a);
        }
        Set<Integer>s1=new HashSet<>();
        for(int b:nums2){
            if(s.contains(b)){
                s1.add(b);
            }
        }
        List<Integer>l=new ArrayList<>(s1);
        int[]arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}