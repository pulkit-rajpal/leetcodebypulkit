class Solution {
    public int missingNumber(int[] array) {
        int count = 0;
        while (count < array.length) {
            int correct = array[count];
            if (array[count] < array.length && array[count] != array[correct]) {
                swap(array, count, correct);
            } else {
                count++;
            }
        }
        int val = 0;
        // search for the missing the number
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
        }
        return array.length;
    }

    void swap(int array[], int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}
