class Solution {
    public int numberOfSteps(int num) {
        int temp =num;
        int res =0;
        // number & 1 will be one if the 
        while(temp > 0)
        {
        if((temp & 1)!=1)
        {
            temp/=2;
        }else { 
            temp-=1;
        }
            res++;
        }
           return res; 
    }
}