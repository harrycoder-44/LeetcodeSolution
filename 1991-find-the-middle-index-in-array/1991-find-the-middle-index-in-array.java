class Solution {
    public int findMiddleIndex(int[] nums) {

        


        for(int i=0; i<nums.length; i++){
            int leftsum = 0;
            int rightsum = 0;


            for(int j = i-1; j>=0; j--){
                leftsum += nums[j];
            }

            for(int k= i+1; k< nums.length; k++){
                rightsum+= nums[k];
            }

            if(leftsum == rightsum){
                return i;
            }
        }

        return -1;

        
        
    }
}