class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int f=0;
        int s=1;
        int count=2;
        while(count<=n){
            int t=s;
            s=s+f;
            f=t;
            count++;
        }
        return s;
        
    }
}