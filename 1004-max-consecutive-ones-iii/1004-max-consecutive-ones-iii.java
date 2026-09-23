class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxlen = 0, left=0, right = 0, zeroes=0;

        while(right < nums.length){
            if(nums[right] == 0){
                zeroes++;
            }

            while(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }

            if(zeroes <= k){
                int len = right - left + 1;
                maxlen = Math.max(maxlen,len);
            }

            right++;
        }

        return maxlen;

        
    }
}
