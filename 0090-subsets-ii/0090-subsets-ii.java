class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        subset2(0,nums,new ArrayList<>(),result);

        return result;


        
    }

    private void subset2(int idx,int[] nums, List<Integer> current, List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);
        subset2(idx+1,nums,current,result);

        current.remove(current.size()-1);
        while(idx + 1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }

        subset2(idx+1,nums,current,result);
        
    }
}