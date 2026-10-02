class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        solve(sb,0,0,n,ans);

        return ans;
    }
    public void solve(StringBuilder sb, int left, int right, int n, List<String> ans){
        if(sb.length() == 2*n){
            ans.add(sb.toString());
            return;
        }

        // Pick '('
        if(left < n){
            sb.append('(');
            solve(sb,left+1,right,n,ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Pick ')'
        if(right < left){
            sb.append(')');
            solve(sb,left,right+1,n,ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}