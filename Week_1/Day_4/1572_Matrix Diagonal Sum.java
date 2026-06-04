class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int row,col;

        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                if (row == col) {
                    sum = sum + mat[row][col];
                }
                else if (row + col == n - 1) {
                    sum = sum + mat[row][col];
                }
            }
        }

        return sum;
    }
}