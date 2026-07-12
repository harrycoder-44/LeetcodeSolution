import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            max = Math.max(max, count);
        }

        int totalFreq = 0;

        for (int freq : map.values()) {
            if (freq == max) {
                totalFreq += freq;
            }
        }

        return totalFreq;
    }
}