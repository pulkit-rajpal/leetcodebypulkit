class Solution {
    public int[] buildArray(int[] nums) {
    
        // Building arrays of the permutations 
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
    return ans;    
}
}