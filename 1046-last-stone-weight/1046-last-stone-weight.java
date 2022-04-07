class Solution {
    public int lastStoneWeight(int[] stones) {
 PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        //int[] stones = new int[]{1};
        int res = 0;
        for (int num : stones) {
            q.add(num);
        }
        while (q.size() > 1) {
            int p2 = q.poll();
            int p1 = q.poll();
            if (p1 <= p2) {
                res = (p2 - p1);
                q.add(res);
            }
        }
        int h = q.peek();
        return h;
    }      
}