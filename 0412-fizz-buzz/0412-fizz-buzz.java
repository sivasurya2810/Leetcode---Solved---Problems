class Solution {
    public List<String> fizzBuzz(int n) {
        String[]arr=new String[n+1];
        List<String>l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                arr[i]="FizzBuzz";
            }
            else if(i%3==0){
                arr[i]="Fizz";
            }
            else if(i%5==0){
                arr[i]="Buzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }
            
        }
        for(String b:arr){
            l.add(b);
        }
        l.remove(0);
        return l;
    }
}