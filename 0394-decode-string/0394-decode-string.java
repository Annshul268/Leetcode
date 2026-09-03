class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ']'){
                st.push(ch);
            }else{
                // pop the string 
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '['){
                    sb.append(st.pop());
                }

                sb.reverse();
                // pop '['
                st.pop();
                
                // pop the multiplier
                StringBuilder multiplier = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    multiplier.append(st.pop());
                }

                multiplier.reverse();

                int x = Integer.parseInt(multiplier.toString());

                // push again the processes string into stack
                while(x > 0){
                    for(int j = 0; j < sb.length(); j++){
                        st.push(sb.charAt(j));
                    }
                    x--;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        ans.reverse();

        return ans.toString();
    }
}