class Solution {
    public int getLeastFrequentDigit(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int result = 9;

        for (int digit : map.keySet()) {
            int freq = map.get(digit);

            if (freq < minFreq || (freq == minFreq && digit < result)) {
                minFreq = freq;
                result = digit;
            }
        }

        return result;
    }
}