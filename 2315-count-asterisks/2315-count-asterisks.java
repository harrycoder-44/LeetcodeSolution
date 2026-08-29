class Solution {
    public int countAsterisks(String s) {

        int count = 0;
        boolean inside = false;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '|') {
                inside = !inside;
            }
            else if (c == '*' && !inside) {
                count++;
            }
        }

        return count;
    }
}