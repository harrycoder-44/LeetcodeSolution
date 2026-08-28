class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int count_max = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {

            int count_ones = 0;

            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count_ones++;
                }
            }

            if (count_ones > count_max) {
                count_max = count_ones;
                index = i;
            }
        }

        return new int[]{index, count_max};
    }
}