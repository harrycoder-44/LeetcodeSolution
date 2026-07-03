class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        find(new ArrayList<>(), arr, l);

        return l;
    }

    public static void find(List<Integer> ans, int arr[], List<List<Integer>> l) {

        if (ans.size() == arr.length) {
            l.add(new ArrayList<>(ans)); 
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!ans.contains(arr[i])) {
                ans.add(arr[i]);
                find(ans, arr, l);
                ans.remove(ans.size() - 1);
            }
        }
        
    }
}