class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int maxleft = 0;

        int[] minright = new int[n];

        minright[n-1] = nums[n-1];


        for(int i=n-2; i>=0; i--){
            minright[i] = Math.min(minright[i+1],nums[i]);

        }

        for(int j=0; j<n; j++){

            maxleft = Math.max(maxleft,nums[j]);


            if(maxleft - minright[j] <= k){
                return j;
            }

        }

        return -1;
    }
}