class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        solve(sb,0,0,n,ans);

        return ans;
    }
    public void solve(StringBuilder sb, int openingBracket, int closingBracket, int n, List<String> ans){
        if(sb.length() == 2*n){
            ans.add(sb.toString());
            return;
        }

        // Pick '('
        if(openingBracket < n){
            sb.append('(');
            solve(sb,openingBracket+1,closingBracket,n,ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Pick ')'
        if(closingBracket < openingBracket){
            sb.append(')');
            solve(sb,openingBracket,closingBracket+1,n,ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}