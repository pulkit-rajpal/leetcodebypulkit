public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res =0;
        // simple solution is using the 
        // just count number of 1 using and with 1 and then do right shift to move forward 
        for (int i =0 ;i<32;i++)
        {
            if ((n&1)==1)
            {
                res++;
            }
            n=n>>>1;
        }
        return res;
        }
}