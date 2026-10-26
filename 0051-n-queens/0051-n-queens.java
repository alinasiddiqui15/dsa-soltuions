class Solution {
    public void solve(char[][] grid, int row, List<List<String>> ans) {
        int n = grid.length;

        //base case
        if(row == n) {
            //fill the matrix
            List<String> curr = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String str = "";
                for(int j = 0; j < n; j++) {
                    str = str + grid[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
            return;
        }

        //try placing queen in every column
        for(int j = 0; j < n; j++) {
            if(grid[row][j] == '.') {
                if(isSafe(grid, row, j)) {
                    grid[row][j] = 'Q'; // select
                    solve(grid, row + 1, ans); // recursion
                    grid[row][j] = '.'; // backtracking
                }
            }
        }
    }
    public boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;

        //check column
        for(int j = 0; j < n; j++) {
            if(grid[row][j] == 'Q') return false;
        }
        //check row
        for(int i = 0; i < n; i++) {
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
    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }
        solve(grid, 0, ans);
        return ans;
    }
}