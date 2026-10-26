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
                count += solve(grid, row + 1); // Recursion
                grid[row][j] = '.';  // Backtracking
            }
        }
        return count;
    }

    public boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;

        //Check Column
        for(int j = 0; j < n; j++) {
            if(grid[row][j] == 'Q') return false;
        }
        //Check Row
        for(int i = 0; i < n; i++) {
            if(grid[i][col] == 'Q') return false;
        }
        // North East
        int i = row;
        int j = col;
        while(i >= 0 && j < n) {
            if(grid[i][j] == 'Q') return false;
            i--;
            j++;
        }
        // North West
        i = row;
        j = col;
        while(i >= 0 && j >= 0) {
            if(grid[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public int totalNQueens(int n) {
        char[][] grid = new char[n][n];

        // Initialize grid with '.'
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }
        return solve(grid, 0);
    }
}