import java.util.Arrays;
import java.util.HashMap;

 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length==2) return new int[]{0,1};
        // basically we need to find a pair for the element
        // like 2+3=5 so 5-3=2 , so we need to find there exists a 2 to satisfy the sum to 5

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            /* Can we optimise this further*/
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[]{i, map.get(t)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}