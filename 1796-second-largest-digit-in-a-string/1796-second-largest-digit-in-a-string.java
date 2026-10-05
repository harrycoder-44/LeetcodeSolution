class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int max2=-1;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int digit= c-'0';
                if(digit > max){
                    max2=max;
                    max=digit;
                }
                else if(digit < max && digit > max2) {
                    max2 = digit;
                }    
            }
        }
        return max2;
    }
}