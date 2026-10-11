class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;


        
    }

    private void findCombinations(int ind, int[] nums, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[ind] <= target){
            ds.add(nums[ind]);
            findCombinations(ind+1,nums,target-nums[ind],ans,ds);
            ds.remove(ds.size()-1);
        }

        while(ind + 1 < nums.length && nums[ind + 1] == nums[ind]){

            ind++;

        }

        findCombinations(ind+1,nums,target,ans,ds);
    }
}