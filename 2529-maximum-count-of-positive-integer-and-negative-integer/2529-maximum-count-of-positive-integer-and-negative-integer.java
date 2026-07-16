class Solution {
    public int maximumCount(int[] nums) {
        int negativecount = 0;
        int positivecount = 0;
        int maxcount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                negativecount++;
            }
            if(nums[i]>0){
                positivecount++;
            }


        }

        if(positivecount > negativecount){
            return positivecount;
        }

        return negativecount;
        
    }
}