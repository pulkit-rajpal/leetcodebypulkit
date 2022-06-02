class Solution {
    public int majorityElement(int[] nums) {
       
        // hashmap solution to find the solution
        // Just traverse the whole array and just keep on checking the value and get the key with the value that has n/2
        if (nums.length ==1)
        {
            return nums[0];
        }
        HashMap<Integer,Integer> map=  new HashMap<>(); 
        int max =0;
        for(int i =0 ;i<nums.length;i++)
        { 
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            
            if ((int)map.get(nums[i])>(nums.length/2))
            {
                max = nums[i];
            }
        }
        return max;
    }
}