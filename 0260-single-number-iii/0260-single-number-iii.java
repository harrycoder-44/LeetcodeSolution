class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(int num: nums){
            if(map.get(num) == 1){
                list.add(num);
            }
        }


        int[] result = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;

        
    }
}