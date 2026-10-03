class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[]row = new int[n];
        int []col = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i]++;
                    col[j]++;
                }

            }
        }

        // make row 0
        for(int i = 0; i < n; i++){
            if(row[i] > 0){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // make col 0
        for(int i = 0; i < m; i++){
            if(col[i] > 0){
                for(int j = 0; j < n; j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}