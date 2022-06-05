class Solution {
    public int brokenCalc(int startValue, int target) {
        /*  observation 
        1. multiply by 2
        2. subs 1 from the num display 
        */
        //See this from this point that we can reduce the problem from reducing the target to the startvalue instead  of the startvalue to target
        // and how we can do this is to do 2 things 1. y  = y/2 and 
        // 2 is we can make y=y+1
        int x = startValue;
        int y = target;
        int count =0;
        while (y>x)
        {
            if (y%2==0)
            {
                y=y/2;
            }
            else 
            {
                y=y+1;
            }
         count++;       
        }
        return count+x-y;
    }
}