class Solution {
    public int maxDifference(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int emin = Integer.MAX_VALUE;
        int omax = 0;

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }


        for(char key : map.keySet()){
            if(map.get(key) % 2 == 0){
                emin = Math.min(emin,map.get(key));
            }else{
                omax = Math.max(omax,map.get(key));
            }
        }


        int ans = omax - emin;

        return ans;

        
    }
}