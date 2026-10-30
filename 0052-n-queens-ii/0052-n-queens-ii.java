class Solution {
    public int solve(char[][] grid, int row) {
        int n = grid.length;
        // Base case
        if(row == n) {
            return 1;
        }

        int count = 0;
        // Try every column
        for(int j = 0; j < n; j++) {
            if(isSafe(grid, row, j)) {
                grid[row][j] = 'Q';  // Select
                count = count + solve(grid, row + 1); // Recursion
                grid[row][j] = '.';  // Backtracking
            }
        }
        return count;
    }
    public boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;

        //for column
        for(int j=0; j<n; j++) {
            if(grid[row][j] == 'Q') return false;
        }
        //for row
        for(int i=0; i<n; i++) {
            if(grid[i][col] == 'Q') return false;
        }
        //north east
        int i = row;
        int j = col;
        while(i >= 0 && j < n) {
            if(grid[i][j] == 'Q') return false;
            i--;
            j++;
        }
        //north west
        i = row;
        j = col;
        while(i >= 0 && j >= 0) {
            if(grid[i][j] == 'Q') return false;
            i--;
            j--;
        }
        //south east
        i = row;
        j = col;
        while(i < n && j < n) {
            if(grid[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //south west
        i = row;
        j = col;
        while(i < n && j >= 0) {
            if(grid[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;
    }
    public int totalNQueens(int n) {
        char[][] grid = new char[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                grid[i][j] = '.';
            }
        }
        return solve(grid, 0);     
    }
}