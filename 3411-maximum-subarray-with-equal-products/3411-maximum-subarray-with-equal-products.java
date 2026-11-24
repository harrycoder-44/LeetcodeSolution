class Solution {
    public int maxLength(int[] nums) {
        int maxlen = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            long prod = 1, l = 1, g = 0;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                if (prod > 25200) break;      

                l = lcm(l, nums[j]);
                g = gcd(g, nums[j]);

                if (prod == l * g) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}