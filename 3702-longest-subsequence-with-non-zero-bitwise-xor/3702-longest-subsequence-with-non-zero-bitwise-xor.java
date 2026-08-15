class Solution {
    public int longestSubsequence(int[] nums) {
        
        int total = 0;
        boolean nonZero = false;
        int n = nums.length;


        for(int num : nums){
            nonZero |= num > 0;
            total ^= num;
        }

        if(total != 0){
            return n;
        }

        if(nonZero){
            return n-1;
        }

        return 0;
    
    }
}