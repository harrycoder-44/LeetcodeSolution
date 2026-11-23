class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m+n];

        int i=0;
        int j=0;
        int idx = 0;

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                merged[idx++] = nums1[i];
                i++;
            }else{
                merged[idx++] = nums2[j];
                j++;
            }
        }

        
        while(i < m){
            merged[idx++] = nums1[i++];
        }
        while(j < n){
            merged[idx++] = nums2[j++];
        }

        double ans = 0.0;

        if(merged.length % 2 == 0){
            int mid = merged.length/2;
            ans = (merged[mid-1] + merged[mid]) / 2.0;
        }else{
            ans = merged[merged.length/2];
        }

        return ans;
        
    }
}