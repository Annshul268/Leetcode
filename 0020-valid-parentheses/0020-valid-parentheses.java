class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[' ){
                st.push(ch);
            }else{
                if(ch == ')'){
                    if(st.isEmpty() || st.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(st.isEmpty() || st.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(st.isEmpty() || st.pop() != '['){
                        return false;
                    }
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}


// class Solution {
//     public boolean isValid(String s) {
        // Stack<Character> st = new Stack<>();
        
        // for(int i = 0; i < s.length(); i++){
        
        //     if(s.charAt(i) == '(' ||s.charAt(i) == '{' ||s.charAt(i) == '[' ){
        //         st.push(s.charAt(i));
        //     }else{
        //         if(s.charAt(i) == ')'){
        //             if(!st.isEmpty() && st.peek() == '('){
        //                 st.pop();
        //             }else{
        //                 return false;
        //             }
        //         }
        //         if(s.charAt(i) == '}'){
        //             if(!st.isEmpty() && st.peek() == '{'){
        //                 st.pop();
        //             }else{
        //                 return false;
        //             }
        //         }
        //         if(s.charAt(i) == ']'){
        //             if(!st.isEmpty() && st.peek() == '['){
        //                 st.pop();
        //             }else{
        //                 return false;
        //             }
        //         }
        //     }
        // }

        // if(st.isEmpty()) return true;
        // return false;
//     }
// }