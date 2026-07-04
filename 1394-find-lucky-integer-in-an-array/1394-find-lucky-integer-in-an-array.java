class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int ans = -1;

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0) + 1);

        }

        for(int num: arr){
            int freq = map.get(num);


            if(num == freq){
                if(ans<num){
                    ans = num;
                }
            }


        
         
        }


        return ans;



        
    }
}