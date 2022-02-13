class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (count < nums.length) {
            int correct = nums[count] - 1;
            if (nums[count] != nums[correct]) {
                swap(nums, count, correct);
            } else {
                count++;
            }
        }
        // search for the missing the number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i+1);
            }
        }
        return list;
       
    }
        static void swap(int array[], int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }

}