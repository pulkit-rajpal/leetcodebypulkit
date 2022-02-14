class Solution {
    public int firstMissingPositive(int[] nums) {
           int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (count < nums.length) {
            int correct = nums[count] - 1;
            if (nums[count] <= nums.length && nums[count] > 0 && nums[count] != nums[correct]) {
                swap(nums, count, correct);
            } else {
                count++;
            }
        }

        // search for the missing the number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length+1;
    }

     void swap(int array[], int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}