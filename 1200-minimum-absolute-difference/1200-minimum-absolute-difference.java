class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int currentdiff = arr[i + 1] - arr[i];
            diff = Math.min(diff, currentdiff);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == diff) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return list;
    }

}
