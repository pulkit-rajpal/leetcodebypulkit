class Solution {
    public int fib(int n) {
        /*
         Going through the dp approach the we take the recursive fromula 
       for the  series 
        */
        int[] f= new int[n+1];
        f[0]=0;
        if (n == 0) return f[n];
        f[1]=1;
        for (int i =2; i<=n;i++)
        {
            f[i]=f[i-2]+f[i-1];
        }
        return f[n];
    }
}