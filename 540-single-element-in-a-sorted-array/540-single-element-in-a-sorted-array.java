class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 0);
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        for (Map.Entry m : map.entrySet()) {
            if (m.getValue().equals(1)) {
                return (int) m.getKey();
            }
        }
        return 0;
    }
}