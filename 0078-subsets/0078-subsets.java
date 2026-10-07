class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        subsets(0,nums,new ArrayList<>(),result);

        return result;

        
    }

    private void subsets(int idx, int[] nums, List<Integer> current, List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);
        subsets(idx+1,nums,current,result);

        current.remove(current.size()-1);
        subsets(idx+1,nums,current,result);
    }
}