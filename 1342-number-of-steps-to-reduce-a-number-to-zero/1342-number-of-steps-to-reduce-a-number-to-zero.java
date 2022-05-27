class Solution {
    public int numberOfSteps(int num) {
        int res =0;
        // number & 1 will be one if the 
        while(num > 0)
        {
        if((num & 1)!=1)
        {
            num/=2;
        }else { 
            num-=1;
        }
            res++;
        }
           return res; 
    }
}