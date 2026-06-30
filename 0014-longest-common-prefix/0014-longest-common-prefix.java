class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i=0; i<strs.length;i++){
            String  s= strs[i];
            int temp=0;


            for(int j=0; j<Math.min(s.length(),prefix.length()); j++){
                if(prefix.charAt(j)!=s.charAt(j)){

                    temp=1;
                    prefix=s.substring(0,j);
                    break;

                }
            }

            if(temp==0){
                prefix=prefix.length()>s.length()?s:prefix;
            }
            
        }

        return prefix;
        
    }
}