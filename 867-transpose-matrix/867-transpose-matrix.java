class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] matrix1 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = matrix[j][i];
            }
        }
            return matrix1;
    }   
}