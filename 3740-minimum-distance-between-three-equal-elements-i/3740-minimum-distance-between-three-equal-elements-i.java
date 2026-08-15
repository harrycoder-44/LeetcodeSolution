class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        int distance = (j - i) + (k - j) + (k - i);
                        ans = Math.min(ans, distance);
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}