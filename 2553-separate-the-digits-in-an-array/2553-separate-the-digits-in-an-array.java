class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int num : nums){
            List<Integer> l = new ArrayList<>();

            while(num > 0){

                int digit = num % 10;

                l.add(digit);

                num /= 10;


            }

            for(int j=l.size()-1; j>=0; j--){
                ans.add(l.get(j));
            }

            


        }

        int[] result = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
        
    }
}