class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int m = n/2;

        HashSet<Integer> set = new HashSet<>();


        for(int i=0; i<n; i++){
            if(!set.contains(candyType[i])){
                set.add(candyType[i]);
            }
        }

        if(set.size() >= m){
            return m;
        }


        return set.size();
        
    }
}