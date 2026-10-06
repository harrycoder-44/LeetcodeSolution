class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
                count++;
            }
            else if(c == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
                count--;
            }else{
                count++;
            }
        }

        return count;
        
    }
}