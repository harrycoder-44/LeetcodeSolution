class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length - k;

        for(int i=0; i<nums.length; i++){
            if(i == n){
                return nums[i];
            }
        }
        return 0;
    }
}