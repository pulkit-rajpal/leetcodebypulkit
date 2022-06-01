class Solution {
    
        private void swap(int[] nums, int i, int j) {
    int d=nums[i];
    nums[i]=nums[j];
    nums[j]=d;
    }

    public void sortColors(int[] nums) {
        // We can do the normal sort using counting that can be done in 2*N or 3*N time 
        // the approach is to use the 3 pointer solution which is low mid and high
        int low = 0;
        int mid = 0; 
        int high = nums.length-1;
        while(mid <= high)
        {
            // if it  is zero at front then swap with low 
            if (nums[mid] == 0)
            {
                swap(nums, low, mid );
                mid++;
                low++;
            }
            // if is it 1 the we do nothing as we want them in the mid 
            else if (nums[mid] == 2)
            {
            
                swap(nums,high, mid );
                high--;
            }
            // If the number is 2 then we have to swap the number towards the end which is high 
            else 
            {
                mid++;
            }
            
            
        }
    
    }
    
    
}