class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char middle = 0;

        for (int i = 0; i < 26; i++) {

            if (freq[i] % 2 == 1 && middle == 0) {
                middle = (char) ('a' + i);
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                sb.append((char) ('a' + i));
            }
        }

        String sb1 = sb.toString();
        String sb2 = sb.reverse().toString();

        return sb1 + (middle == 0 ? "" : middle) + sb2;
    }
}