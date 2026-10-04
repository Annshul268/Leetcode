class Solution {
    public int longestValidParentheses(String s) {
        int first = LtoR(s);
        int second = RtoL(s);

        return Math.max(first,second);
    }
    public int LtoR(String s){
        int open = 0;
        int close = 0;
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(close > open){
                open = 0;
                close = 0;
            }

            if(ch == '(') open++;
            if(ch == ')') close++;

            if(open == close){
                result = Math.max(result,open+close);
            }
        }

        return result;
    }

    public int RtoL(String s){
        int open = 0;
        int close = 0;
        int result = 0;

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);

            if(open > close){
                open = 0;
                close = 0;
            }

            if(ch == '(') open++;
            if(ch == ')') close++;

            if(open == close){
                result = Math.max(result,open+close);
            }
        }

        return result;
    }
}