class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,k,nums,n,ans,new ArrayList<>());
        return ans;
        
    }

    private void findCombinations(int ind,int k,int[] nums,int n,List<List<Integer>> ans, List<Integer> ds){
        if(ds.size() == k){
            if(n == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(ind == nums.length){
            return;
        }

        if(nums[ind] <= n){
            ds.add(nums[ind]);
            findCombinations(ind+1,k,nums,n-nums[ind],ans,ds);
            ds.remove(ds.size() - 1);
        }


        findCombinations(ind+1,k,nums,n,ans,ds);
    }
}