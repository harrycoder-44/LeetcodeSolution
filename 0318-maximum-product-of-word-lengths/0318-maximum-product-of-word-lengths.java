class Solution {
    public int maxProduct(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!hasCommon(words[i], words[j])) {
                    int product = words[i].length() * words[j].length();
                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }

    private boolean hasCommon(String a, String b) {
        boolean[] seen = new boolean[26];

        for(char c : a.toCharArray()){
            seen[c - 'a'] = true;

        }

        for(char c : b.toCharArray()){
            if(seen[c - 'a']){
                return true;
            }
        }

        return false;
    }
}