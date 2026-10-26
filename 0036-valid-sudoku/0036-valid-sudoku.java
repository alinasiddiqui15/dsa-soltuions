
class Solution {

    public boolean isValid(char[][] board, int row, int col, char ch) {

        // Check horizontally
        for(int j = 0; j < 9; j++) {
            if(board[row][j] == ch) {
                return false;
            }
        }

        // Check vertically
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == ch) {
                return false;
            }
        }

        // Check 3x3 grid
        int rGrid = (row / 3) * 3;
        int cGrid = (col / 3) * 3;

        for(int i = rGrid; i < rGrid + 3; i++) {
            for(int j = cGrid; j < cGrid + 3; j++) {
                if(board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char ch = board[i][j];
                // Skip empty cells
                if(ch == '.') {
                    continue;
                }
                // Remove current character temporarily
                board[i][j] = '.';
                // Check validity
                if(!isValid(board, i, j, ch)) {
                    board[i][j] = ch;
                    return false;
                }
                // Restore original character
                board[i][j] = ch;
            }
        }
        return true;
    }
}
