class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sq);

        int minus = n / 2;          
        long result = 0;

        for (int i = 0; i < minus; i++) {
            result -= sq[i];       
        }
        for (int i = minus; i < n; i++) {
            result += sq[i];        
        }
        return result;
    }
}