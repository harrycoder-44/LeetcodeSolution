class Solution {
    public boolean canAliceWin(int n) {

        if(n < 10){
            return false;
        }

        int cnt = 0;

        for(int i=10; i>0; i--){
            n -= i;
            cnt++;

            if(n < i-1 && cnt % 2 == 1){
                return true;
            }

            if(n < i-1 && cnt % 2 == 0){
                return false;
            }
        }
        

        return false;
    }
}