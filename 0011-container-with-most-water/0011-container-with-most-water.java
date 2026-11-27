class Solution {
    public int maxArea(int[] height) {
        int left = 0; int right = height.length-1;

        int max = Integer.MIN_VALUE;


        while(left < right){

            int height1 = Math.min(height[left],height[right]);
            int width = right - left;

            int area = height1  * width;

            max = Math.max(max,area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }


        }

        return max;
        
    }
}