class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;
        ans.add(1);

        for(int i = 1; i <= rowIndex; i++){
            res *= (rowIndex+1-i);
            res /= i;
            ans.add((int)res);
        }

        return ans;
    }
}