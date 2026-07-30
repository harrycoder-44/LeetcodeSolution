class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int ans = 0;

        for(char c : s.toCharArray()){
            freq[c]++;
        }

        boolean hasodd = false;


        for(int j=0; j<128; j++){
            ans += (freq[j]/2) * 2;

            if(freq[j]%2 == 1){
                hasodd = true;
            }

        }

        if(hasodd){
            ans++;
        }


        return ans;
        

    }
}