class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String text = paragraph.toLowerCase().replaceAll("[^\\w\\s]", " ");

        String[] words = text.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        HashSet<String> banSet = new HashSet<>();
        for (String b : banned) {
            banSet.add(b);
        }

        for (String word : words) {
            if (word.length() == 0 || banSet.contains(word)) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String mostcommon = "";
        int maxcount = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxcount) {
                maxcount = e.getValue();
                mostcommon = e.getKey();
            }
        }

        return mostcommon;
    }
}