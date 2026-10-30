class Solution {
    public void solve(char[][] grid, int row, List<List<String>> ans) {
        int n = grid.length;

        if(row == n) {
            List<String> curr = new ArrayList<>();
            for(int i=0; i<n; i++) {
                String str = "";
                for(int j=0; j<n; j++) {
                    str = str + grid[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
            return;
        }

        for(int j=0; j<n; j++) {
            if(grid[row][j] == '.') {
                if(isSafe(grid, row, j) == true) {
                    grid[row][j] = 'Q';
                    solve(grid, row+1, ans);
                    grid[row][j] = '.';                
                }
            }
        }
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
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] grid = new char[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                grid[i][j] = '.';
            }
        } 
        solve(grid, 0, ans);
        return ans;             
    }
}