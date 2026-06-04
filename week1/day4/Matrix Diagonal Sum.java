class Solution {

    public int diagonalSum(int[][] mat) {

        int sum = 0;

        int n = mat.length;

        for(int i = 0; i < n; i++) {

            // primary diagonal
            sum = sum + mat[i][i];

            // secondary diagonal
            if(i != n - 1 - i) {
                sum = sum + mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}
