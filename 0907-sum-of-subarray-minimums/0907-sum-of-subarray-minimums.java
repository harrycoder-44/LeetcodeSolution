class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1_000_000_007;

        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        int[] pse = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.empty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (left * right) % mod;
            contribution = (contribution * arr[i]) % mod;

            total = (total + contribution) % mod;
        }

        return (int) total;
    }
}
