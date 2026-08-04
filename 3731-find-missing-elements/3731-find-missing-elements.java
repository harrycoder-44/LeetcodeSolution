class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int num : nums){
            set.add(num);
            smallest = Math.min(smallest,num);
            largest = Math.max(largest,num);

        }

        for(int i=smallest; i<=largest; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;

    }
}