class Solution {
    public int[] searchRange(int[] nums, int target) {

        int p = lowerBond(nums,target);
        int q = upperBond(nums,target);
        if (p == -1 || p == nums.length || nums[p] != target) {
            return new int[] {-1, -1};
        }


        return new int[] {p, q == -1 ? nums.length - 1 : q - 1};
        
        
    }

    private int lowerBond(int[] nums, int target){
        int n = nums.length;
        int ans=-1; int low=0; int high=n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    private int upperBond(int[] nums, int target){
        int n= nums.length;
        int ans = -1; int low=0; int high=n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] > target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}