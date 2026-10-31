class Solution {
    public boolean isCorrect(char[][] board, int row, int col, char ch) {
        int n = board.length;

        //check in col
        for(int j = 0; j < 9; j++) {
            if(board[row][j] == ch) return false;
        }
        //check in row
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == ch) return false;            
        }
        //check 3 * 3 grid
        int rGrid = row/3 * 3;
        int cGrid = col/3 * 3;
        for(int i = rGrid; i < rGrid + 3; i++) {
            for(int j = cGrid; j < cGrid + 3; j++) {
                if(board[i][j] == ch) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                char ch = board[i][j];
                board[i][j] = '.';
                if(isCorrect(board, i, j, ch) == false) return false;
                board[i][j] = ch;
                }
            }
        }
        return true;
    }
}