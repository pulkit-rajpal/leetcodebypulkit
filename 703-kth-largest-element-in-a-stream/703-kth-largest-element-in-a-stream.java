class KthLargest {

    final PriorityQueue<Integer> q;
    final  int k;
    // This function 
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
