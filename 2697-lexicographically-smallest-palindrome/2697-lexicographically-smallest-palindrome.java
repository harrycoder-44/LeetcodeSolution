class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();

        int left=0; int right=ch.length-1;

        while(left < right){

            if(ch[left] != ch[right]){
                char min = (char) Math.min(ch[left],ch[right]);

                ch[left] = min;
                ch[right] = min;
            }
            left++;
            right--;

        }

        return new String(ch);
        
    }
}