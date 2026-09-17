class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total_elements = n * n;
        int[] count = new int[total_elements + 1];
        int repeated = -1;
        int missing = -1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                count[grid[i][j]]++;
            }
        }

        for(int i=1; i<=total_elements; i++){
            if(count[i]==2){
                repeated = i;

            }else if(count[i]==0){
                missing=i;
            }
        }

        return new int[] {repeated,missing};
    }
}