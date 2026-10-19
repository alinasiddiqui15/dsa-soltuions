class Solution {
    public boolean check(int[][] grid, int row, int col, int x) {
        int n = grid.length;
        if(x == n*n-1) return true;

        //2up + 1right
        int i = row-2;
        int j = col+1;
        if(i>=0 && j<n && grid[i][j] == x+1) {
            return check(grid,i,j,x+1);
        }
        //2up + 1left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j] == x+1){
            return check(grid,i,j,x+1);
        }
        //2right + 1up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && grid[i][j] == x+1) {
            return check(grid,i,j,x+1);
        }
        //2right + 1down
        i = row+1;
        j = col+2;
        if(i < n && j<n && grid[i][j] == x+1){
            return check(grid ,i,j,x+1);
        }
        //2down + right
        i = row+2;
        j = col+1;
        if(i<n && j<n && grid[i][j] == x+1) {
            return check(grid,i,j,x+1);
        }
        //2down + left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && grid[i][j] == x+1) {
            return check(grid,i,j,x+1);
        }
        //2left + 1up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j] == x+1) {
            return check(grid,i,j,x+1);
        }
        //2left + 1down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && grid[i][j] == x+1) {
            return check(grid,i,j,x+1);
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        return check(grid,0,0,0);        
    }
}