class Solution {
    static int [] dr = {-1,1,0,0};
    static int [] dc = {0,0,-1,1};
    static int rowL;
    static int colL;
    public int closedIsland(int[][] grid) {
        rowL=grid.length;
        colL=grid[0].length;
        for(int i =0;i<rowL;i++){
            if(grid[i][0]==0) dfs(i,0,grid);
            if(grid[i][colL-1]==0) dfs(i,colL-1,grid);
        }
        for(int i=0;i<colL;i++){
            if(grid[0][i]==0) dfs(0,i,grid);
            if(grid[rowL-1][i]==0) dfs(rowL-1,i,grid);
        }
        int ans =0;
        for(int i =0;i<rowL;i++){
            for(int j =0;j<colL;j++){
                if(grid[i][j]==0){
                    dfs(i,j,grid);
                    ans++;
                }
            }
        }
        return ans ;
    }
    public static void dfs(int r, int c, int [][] grid){
        if(r<0 || c<0 || r>=rowL || c>=colL || grid[r][c]==1) return ;

        grid[r][c]=1;
        for(int i=0;i<4;i++){
            dfs(r+dr[i] , c+dc[i] , grid);
        }
    }
}