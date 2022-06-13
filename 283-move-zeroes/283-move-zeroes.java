class Solution {
    public void moveZeroes(int[] nums) {
        /*
        i=0
        0,1,0,3,12
        j=0
        
        i=0
        0,1,0,3,12
        j=
        
        
        */
        // 2 pointer r and l , r will move if theer is 0 and swap and l will move only there is a numeric 
            int r =1;
            int l =0;
        if (nums.length==1) return;
        while(r < nums.length)
        {
            if (nums[l]!=0)
            {
            l++;
            }
            if (nums[r]==0)
            {
                r++;
            }
            else 
            {
            int temp = nums[l];
            nums[l]=nums[r];
            nums[r]=temp; 
            r++;
            }
        }
        
        }
}