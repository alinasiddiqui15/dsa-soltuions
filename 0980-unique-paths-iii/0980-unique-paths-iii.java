
class Solution {
    public int helper(int sr, int sc, int er, int ec,
                      int[][] grid, int count) {

        int row = grid.length;
        int col = grid[0].length;

        if (sr < 0 || sr >= row || sc < 0 || sc >= col)
            return 0;

        if (grid[sr][sc] == -1)
            return 0;

        if (sr == er && sc == ec) {
            return count == 1 ? 1 : 0;
        }

        int originalValue = grid[sr][sc];
        grid[sr][sc] = -1;

        int right = helper(sr, sc + 1, er, ec, grid, count - 1);
        int left  = helper(sr, sc - 1, er, ec, grid, count - 1);
        int up    = helper(sr - 1, sc, er, ec, grid, count - 1);
        int down  = helper(sr + 1, sc, er, ec, grid, count - 1);

        grid[sr][sc] = originalValue;

        return right + left + up + down;
    }

    public int uniquePathsIII(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int sr = -1, sc = -1;
        int er = -1, ec = -1;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] != -1) {
                    count++;
                }

                if (grid[i][j] == 1) {
                    sr = i;
                    sc = j;
                } else if (grid[i][j] == 2) {
                    er = i;
                    ec = j;
                }
            }
        }

        return helper(sr, sc, er, ec, grid, count);
    }
}
