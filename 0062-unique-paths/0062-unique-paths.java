class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ans = new int[m][n];

        for(int i=0; i<n; i++){ //filled 0th row with 1
            ans[0][i] = 1;
        }
        for(int i=1; i<m; i++){ //filled 0th col with 1
            ans[i][0] = 1;
        }

        //complete the matrix from [1,1] to [m-1], [n-1]
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                ans[i][j] = ans[i][j-1] + ans[i-1][j];
            }
        }
        return ans[m-1][n-1];
    }
}