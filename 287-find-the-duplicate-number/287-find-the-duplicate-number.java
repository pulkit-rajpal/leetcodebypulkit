class Solution {
    public int findDuplicate(int[] nums) {
        
             int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (count < nums.length) {

            if (nums[count] != count+1) {
                int correct = nums[count] - 1;
                if (nums[count] != nums[correct]) {
                    swap(nums, count, correct);
                } else {

                    return  nums[count];
                }
            }

            else {
                count++;
            }
        }
        return 0;
   
    }
        static void swap(int array[], int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }


}