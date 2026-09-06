class Solution {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }


     HashSet<Integer> frequencies = new HashSet<>(map.values());


     return frequencies.size() == 1;

        
    }
}