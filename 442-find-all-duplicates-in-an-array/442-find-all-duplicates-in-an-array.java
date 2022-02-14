class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                list.add(nums[i]);
            }
        }
        return list;


    }
         void swap(int array[], int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }

}