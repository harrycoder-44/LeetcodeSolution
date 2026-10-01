class Solution {
    public long subArrayRanges(int[] nums) {
        return MaxSum(nums) - MinSum(nums);
    }

    private long MaxSum(int[] nums){
        int n = nums.length;

        Stack<Integer> st = new Stack<>();

        int[] nle = new int[n];
        int[] ple = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!st.empty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }

            if(st.empty()){
                nle[i] = n; 
            }else{
                nle[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();

        for(int i=0; i<n; i++){
            while(!st.empty() && nums[st.peek()] < nums[i]){
                st.pop();
            }

            if(st.empty()){
                ple[i] = -1;
            }else{
                ple[i] = st.peek();
            }

            st.push(i);
        }

        long total = 0;
        for(int i=0; i<n; i++){
            long left = i-ple[i];
            long right = nle[i] - i;

            long contribution = left * right;
            contribution = contribution * nums[i]; 

            total = total + contribution;
        }
        return total; 
    }

    private long MinSum(int[] nums){
        int n = nums.length; 

        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        int[] pse = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && nums[st.peek()] >= nums[i]) { 
                st.pop();
            }
            nse[i] = st.empty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && nums[st.peek()] > nums[i]) { 
                st.pop();
            }
            pse[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = left * right;
            contribution = contribution * nums[i]; 

            total = total + contribution;
        }

        return total;
    }
}
