class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;

        int cost = 1;
        int used = 0;

        while (n > 0) {
            int take = Math.min(8, n); // 8 keys
            pushes += take * cost;

            n -= take;
            cost++;
        }

        return pushes;
    }
}