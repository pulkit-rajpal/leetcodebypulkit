class Solution {
    public void rotate(int[] nums, int k) {

    // the whole thing is we can just shift the array by taking help of the another
    // array
    if (nums.length == 1) {
        return;
    }
    int[] array = new int[nums.length];

    /* we have to modify this */
    // the ctach here we can use the (i+k)%len to get the rotation array that is it 

    for (int i = 0; i < nums.length; i++) {

    array[(i+k)%nums.length] = nums[i];

    }
    //  Copying the array 
    for (int i = 0; i < array.length; i++) {
    nums[i] = array[i];
    }

    }
}