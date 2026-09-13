class Solution { 
    public int minDays(int[] bloomDay, int m, int k) { 
        int n = bloomDay.length; 
        
        if ((long) m * k > n) {
            return -1;
        }

        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < n; i++){ 
            max = Math.max(max, bloomDay[i]); 
            min = Math.min(min, bloomDay[i]); 
        } 

        int left = min; 
        int right = max; 
        int ans = -1;  

        while(left <= right){ 
            int mid = left + (right - left) / 2; 
            
            if(possible(bloomDay, mid, m, k)){ 
                ans = mid; 
                right = mid - 1; 
            } else { 
                left = mid + 1; 
            } 
        } 
        return ans; 
    } 

    private boolean possible(int[] bloomDay, int mid, int m, int k){ 
        int count = 0; 
        int noOfb = 0; 
        int n = bloomDay.length; 
        
        for(int i = 0; i < n; i++){ 
            if(bloomDay[i] <= mid){ 
                count++; 
            } else { 
                noOfb += (count / k); 
                count = 0; 
            } 
        } 
        noOfb += (count / k); 
        
        return noOfb >= m; 
    } 
}
