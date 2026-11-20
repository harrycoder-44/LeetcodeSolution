class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;

        int left = 1;
        int right = 10000000;   

        while(left <= right){
            int mid = left + (right - left)/2;

            if(isValid(dist,mid,hour)){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return left > 10000000 ? -1 : left;   
        
    }

    private boolean isValid(int[] dist, int mid, double hour){
        double ans = 0;
        int n = dist.length;

        for(int i = 0; i < n - 1; i++){
            ans += Math.ceil((double) dist[i] / mid);   
        }
        ans += (double) dist[n - 1] / mid;              

        return ans <= hour;
    }
}