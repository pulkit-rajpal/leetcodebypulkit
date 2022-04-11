class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        
        //Basic Approach is to store the value of the row and col where the element is zero in a row and col and as soon as we encounter a same row or col we will make the as 0 
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i1 = 0; i1 < matrix.length; i1++) {
            for (int j1 = 0; j1 < matrix[0].length; j1++) {
                if (row[i1] == 1 || col[j1] == 1) {
                    matrix[i1][j1] = 0;
                }

            }
        }
    }
}