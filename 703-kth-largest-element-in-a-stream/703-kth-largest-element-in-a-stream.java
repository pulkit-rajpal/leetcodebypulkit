/*

1. First point to note is that we have to use offer instead of add .
2. So we have to find largest in the k element so we can use heap .
3. we need to add given elements and then build a dd function as we have to find the kth largest element so we will pop till the size become less the k and then pring the peek  */


class KthLargest {

    final PriorityQueue<Integer> q;
    final  int k;
    
    public KthLargest(int k, int[] nums) {
        q= new PriorityQueue<Integer>(k);
        for (int num : nums) {
            q.add(num);
        }
        this.k = k;
    }

    public int add(int val) {
        q.offer(val);
        while(q.size()>k)
        {
            q.poll();
        }
        return q.peek();
    }
}
