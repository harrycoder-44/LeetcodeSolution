class Solution {
    public int scoreOfParentheses(String s) {

        Deque<Integer> st = new ArrayDeque<>();

        st.push(0);

        for(char c: s.toCharArray()){

            if(c == '('){
                st.push(0);
            }else{
                int inner = st.pop();
                int value = Math.max(2 * inner , 1);
                st.push(st.pop() + value);
            }


            
        }
        

        return st.pop();
    
    }
}