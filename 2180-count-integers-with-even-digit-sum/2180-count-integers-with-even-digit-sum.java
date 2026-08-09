class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1; i<=num; i++){
            int curr = i;

            int sum = 0;

            while(curr > 0){
                int digit = curr % 10;
                sum += digit;

                curr /= 10;
                
            }
            if(sum%2==0){
                count++;

            }
        }
        return count;
    }
}