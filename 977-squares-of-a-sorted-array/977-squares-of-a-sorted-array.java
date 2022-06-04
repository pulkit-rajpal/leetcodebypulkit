class Solution {
    public int[] sortedSquares(int[] nums) {
        int start =0;
        int end =nums.length-1;
        int[] res = new int[nums.length];
        /*
        Some crucial observations 
        1. The left most AND right contains the most bigger values
        2. So we graph of the array we be decreasing and then mid and then increasing.
        3. So basically we can just compare left and right and append to our result array 
        */
        // we want non decreasing array we should run from end to start to put element from back 
        for(int i =nums.length-1;i>=0 ;i--)
        {
            if(Math.abs(nums[start]) > Math.abs(nums[end]))
            {
                res[i]= nums[start]*nums[start];
                start++;
            }else 
            {
                res[i]= nums[end]*nums[end];
                end--;
            }
        }
        return res;
    }
}