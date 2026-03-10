class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<String>l=new ArrayList<>(Arrays.asList(names));
        List<Integer>l1=new ArrayList<>();
        for(int h:heights){
            l1.add(h);
        }
        List<Integer>l2=new ArrayList<>(l1);
        List<String>ans=new ArrayList<>();
        while(l2.size()!=0){
            int max=Collections.max(l2);
            int ind=l1.indexOf(max);
            ans.add(l.get(ind));
            l2.remove(Collections.max(l2));
        }
        String[]arr=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }  
        names=arr;
        return arr;      
    }
}