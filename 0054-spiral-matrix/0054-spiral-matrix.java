class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        while(top <= bottom && left <= right){
            // left to right (print top)
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            // top to bottom (print left)
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }right--;

            // if only one top is to print then it will print that again in reverse
            if(top <= bottom){
                // right to left (print bottom)
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }bottom--;
            }

            if(left <= right){
                // bottom to top (print right)
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }left++;
            }
        }

        return list;
        
    }
}