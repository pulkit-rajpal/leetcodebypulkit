class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Use hashtable to store element and find the distinct
        HashSet<Integer> set = new HashSet<Integer>();
        // set.add() return true if element does not exists  
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    
}