class Solution {
    public int getMaxLen(int[] nums) {
        /* observation 
        1. if zero we just  have to reset  
        2.keep track of negative count 
        3. here pos and neg is positibe product or negative product len count*/
        // first neg and last zero is -1 because of index 
        int firstneg  = -1;
        int negcount  = 0;
        int lastzero =-1;
        int j = 0;
        int max = 0;
        while (j < nums.length) {
            
             if (nums[j] < 0) {
                // if the number is  neg then we need to make
                // sure that there is neg count ++ and we have  first negative updated as first neg will help in calculating the max                   
                firstneg =firstneg==-1?j :firstneg;
                negcount++;
            } 
            
         if (nums[j] == 0) {
                // if the numvber is zero just reset everything and start new 
                firstneg  = -1;
                negcount  = 0;
                lastzero =j;
            }  

            else {
                
                // if the neg %2==0 then get then total len from last zero else from the first zero e have                 
                
                max =  (negcount%2==0) ? Math.max(max, j-lastzero) :Math.max(max,j-firstneg);
        }   
            j++;
        }
        return max;
    }        
}