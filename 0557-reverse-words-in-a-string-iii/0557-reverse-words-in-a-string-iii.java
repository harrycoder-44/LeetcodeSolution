class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] arr = word.toCharArray();
            int start = 0, end = arr.length - 1;

            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            result.append(new String(arr)).append(" ");
        }

        return result.toString().trim();
    }
}