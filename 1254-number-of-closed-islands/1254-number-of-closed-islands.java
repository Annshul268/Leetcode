class Solution {
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    int []rowDirection = {1,-1,0,0};
    int []colDirection = {0,0,1,-1};

    // Check for vaid neighbour
    public boolean isValid(int newR ,int newC ,int n ,int m){
        if(newR >= 0 && newR < n && newC >= 0 && newC < m){
            return true;
        }
        return false;
    }

    public boolean bfsTomakeBoundary(int [][]grid,boolean isVisited[][] ,int sr ,int sc ,int n ,int m){
        Queue<Pair> q = new LinkedList<>();
        
        boolean isClosed = true;

        q.add(new Pair(sr,sc));
        isVisited[sr][sc] = true;

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int currR = curr.row;
            int currC = curr.col;

            // check for boundary case
            if(currR == 0 || currR == n-1 || currC == 0 || currC == m-1){
                isClosed = false;
            }
            // we can return this directly but we also 
            // need to mark visited to all neighbour of curr and 
            // if we return it will cause unmarked 1 which is connected to boundary 1

            for(int i = 0 ; i < 4 ; i++){
                int newR = currR + rowDirection[i];
                int newC = currC + colDirection[i];

                if(isValid(newR ,newC ,n ,m) && !isVisited[newR][newC] && grid[newR][newC] == 0){
                    isVisited[newR][newC] = true;
                    q.add(new Pair(newR,newC));
                }
            }
        }
        return isClosed;
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ;

        int countClosedIsland = 0;
        boolean isVisited[][] = new boolean[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 0 && !isVisited[i][j]){
                    
                    if(bfsTomakeBoundary(grid ,isVisited ,i ,j ,n ,m)){
                        countClosedIsland++;
                    }
                }
            }
        }

        return countClosedIsland;
     
    }
}