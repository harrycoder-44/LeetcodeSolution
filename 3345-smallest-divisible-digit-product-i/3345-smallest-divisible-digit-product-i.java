class Solution {
    public int smallestNumber(int n, int t) {

        while(true){
            if(Divisible(n,  t)){
                return n;
            }
            else{
                n++;
            }
        }


        
    }

    private boolean Divisible(int num, int t){
        int product = 1;

        int number = num; 

        while(number > 0){
            int digit = number%10;
            product *= digit;

            number /= 10;
        }

        return product % t == 0;
    }
}