class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        find1("", 0, 0, n, list);
        return list;
    }

    public static void find1(String ans, int open, int close, int n, List<String> list) {
        if (open == n && close == n) {
            list.add(ans);
            return;
        }

        if (open < n) {
            find1(ans + "(", open + 1, close, n, list);
        }

        if (close < open) {
            find1(ans + ")", open, close + 1, n, list);
        }
    }
}