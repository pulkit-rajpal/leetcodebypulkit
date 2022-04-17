class Solution {
    ArrayList<Integer> array = new ArrayList<>();

    
    public List<Integer> lexicalOrder(int n) {
        /* By: PULKIT RAJPAL */
        
    // As we have to build the
        /*
        lexicographic order is
        1 10 101 102 .... 109
        11 111 112 113 .... 119
        2 21 22 23 24
         */
        // 1 to 9 as 10 will be the part of the 1 for lexograpic Number 
        for (int i = 1; i <= 9; i++) {
            // calling dfs to find all the familiar number related to 1 to n
            dfs(i, n);
        }
        
        return array;
    }

    public  void dfs(int i, int n) {
        // This is an important point we are making is that we have to find till the nth number 
        if (i > n) return;

        array.add(i);

        /* Here we're again recursively finding the familiar
         of given i and for that we're again finding recursively.
         */

        for (int j = 0; j < 10; j++) {
            dfs(10 * i + j, n);
        }
    }
}