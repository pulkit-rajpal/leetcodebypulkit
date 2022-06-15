class Solution {
    public boolean isPowerOfTwo(int n) {
        // solution will be n & (n-1) as only that would give us the power of 2
        
        if (n<1)
        {
            return false;
        }
    return (n& (n-1))==0;
    }
}