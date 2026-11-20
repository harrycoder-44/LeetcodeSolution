class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int left = 1;
        int right  = 0;

        for(int c : candies){
            right = Math.max(right,c);
        }

        while(left <= right){
            int mid = left + (right - left)/2;

            if(isValid(candies,mid,k)){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }

        return right;
    }

    private boolean isValid(int[] candies, int mid,long k){
        long ans = 0;

        for(int c : candies){
            ans += c/mid;
        }

        return ans >= k;
    }
}