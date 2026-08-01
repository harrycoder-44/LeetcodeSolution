class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str = s1 + " " + s2;

        String[] result = str.split(" ");

        List<String> list = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();

        for(String word : result){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(String word : result){
            if(map.get(word) == 1){
                list.add(word);
            }
        }
        String[] uncommon = new String[list.size()];

        for(int i=0; i<list.size(); i++){
            uncommon[i] = list.get(i);
        }

        return uncommon;
        
    }
}