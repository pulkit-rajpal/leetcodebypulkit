class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length - 1;
        int maxc = matrix[0].length - 1;
        int j = 0;
        int i = 0;
        int cnt = 0;
        int tne = (maxc + 1) * (maxr + 1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (cnt < tne) {
            // print the top wall
            for (j = minr, i = minc; j <= maxc && cnt < tne; j++) {
                list.add(matrix[i][j]);
                cnt++;
            }
            minr++;
            // print the right wall
            for (i = minr, j = maxc; i <= maxr && cnt < tne; i++) {
                list.add(matrix[i][j]);
                cnt++;
            }
            maxc--;
            // print the bottom wall
            for (j = maxc, i = maxr; j >= minc && cnt < tne; j--) {
                list.add(matrix[i][j]);
                cnt++;
            }
            maxr--;
            // print the left wall
            for (i = maxr, j = minc; i >= minr && cnt < tne; i--) {
                list.add(matrix[i][j]);
                cnt++;
            }
            minc++;
        }
        return list;
    }
    }
