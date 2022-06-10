//our own customer comparator 

    class custom implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        String a = String.valueOf(o1)+String.valueOf(o2);
        String b = String.valueOf(o2)+String.valueOf(o1);
        return b.compareTo(a);
    }

}
            



class Solution {
    public String largestNumber(int[] nums) {
        /* we are building priority queue to store the string int he order of the first digit which is digit %10*/
           int zc =0;
        // if there are zeros only

   for (int i = 0; i < nums.length; i++) {
       if (nums[i]==0)
       {
        zc++;
       }
   }
   
   if (zc == nums.length){ return "0"; }       

        /* we are building priority queue to store the string int he order of the first digit which is digit %10*/
   PriorityQueue<Integer> queue = new PriorityQueue(new custom());
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        
        while (!queue.isEmpty()) {
            str.append(queue.poll());
        }
        return str.toString();    }}