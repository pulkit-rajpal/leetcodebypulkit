class Solution {
    public int[] twoSum(int[] numbers, int target) {
            // So the approach is that we have a sorted array so
        // the point of the whole approach is that we keep on
        // moving to the side which we think have the target

        int i = 0;
        int j = numbers.length-1;
        int sum = 0;
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            }
            if (sum < target) {
                // push it to the right side;
                i++;
            } else {
                j--;
            }

        }

        return new int[] { -1, -1 };

    }
}