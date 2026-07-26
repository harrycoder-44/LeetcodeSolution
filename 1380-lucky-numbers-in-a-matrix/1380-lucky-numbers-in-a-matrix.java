class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            int min = Integer.MAX_VALUE;
            for (int c = 0; c < matrix[0].length; c++) {
                min = Math.min(min, matrix[r][c]);
            }
            list1.add(min);
        }

        for (int c = 0; c < matrix[0].length; c++) {
            int max = Integer.MIN_VALUE;
            for (int r = 0; r < matrix.length; r++) {
                max = Math.max(max, matrix[r][c]);
            }
            list2.add(max);
        }

        list1.retainAll(list2);

        return list1;
    }
}