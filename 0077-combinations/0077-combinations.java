class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        find(1, n, k, new ArrayList<>(), l);
        return l;
    }

    public void find(int start, int n, int k, List<Integer> ans, List<List<Integer>> l) {

        if (ans.size() == k) {
            l.add(new ArrayList<>(ans));
            return;
        }

        for (int i = start; i <= n; i++) {
            ans.add(i);
            find(i + 1, n, k, ans, l);
            ans.remove(ans.size() - 1); 
        }
    }
}