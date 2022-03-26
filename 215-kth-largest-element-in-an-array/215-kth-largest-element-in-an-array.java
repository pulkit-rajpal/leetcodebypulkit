import java.util.*;


class Solution {
    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i =0; i<nums.length;i++)
        {
            queue.offer(nums[i]);
            if (queue.size() > k)  {
                queue.poll();
            }
             }
        return queue.peek();       
    }
}