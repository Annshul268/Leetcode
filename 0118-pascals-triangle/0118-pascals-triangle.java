class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            ans.add(fullrow(row));
        }
        return ans;
    }
    public List<Integer> fullrow(int n){
        List<Integer> temp = new ArrayList<>();
        int ansrow = 1;
        temp.add(ansrow);
        for(int i = 1; i < n; i++){
            ansrow = ansrow*(n-i);
            ansrow = ansrow/i;
            temp.add(ansrow);
        }
        return temp;
    }
}