class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxlen = 0;

        for (int right = 0; right < s.length(); right++) {

            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.get(s.charAt(right)) > 1) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }


            int len = right - left + 1;
            maxlen = Math.max(maxlen,len);
            
        }

        return maxlen;

    }
}