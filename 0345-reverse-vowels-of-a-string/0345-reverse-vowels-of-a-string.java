class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {

            // skip non-vowels from left
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // skip non-vowels from right
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // swap ONLY when both are vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}