class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }else{
                break;
            }
        }

        int ans = sum;

        while(isThere(nums,ans)){
            ans++;
        }

        return ans;

        

        
    }

    private boolean isThere(int[] nums, int ans){
        for(int num : nums){
            if(num == ans){
                return true;
            }
        }
        return false;
    }
}