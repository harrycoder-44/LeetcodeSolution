class Solution {
    public int maxSum(int[] nums) {
        int maxSum = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(getMax(nums[i]) == getMax(nums[j])){
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        return maxSum;
    }
    
    static int getMax(int n){
        int max = 0;
        while(n > 0){
            int l = n % 10;
            max = Math.max(max, l);
            n /= 10;
        }
        return max;
    }
}