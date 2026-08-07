class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 0;
        int max = 0;
        int n = nums.length;

        for(int i = 0; i < k; i++){
            min += nums[i];
        }

        for(int j = n - 1; j >= n - k; j--){
            max += nums[j];
        }

        int diff = max - min;
        return diff;
    }
}