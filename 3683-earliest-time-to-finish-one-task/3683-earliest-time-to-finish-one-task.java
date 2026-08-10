class Solution {
    public int earliestTime(int[][] tasks) {
        int row = tasks.length;
        int col = tasks[0].length;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<row; i++){
            int sum = 0;
            for(int j=0; j<col; j++){
                sum = sum + tasks[i][j];
            }

            if(sum < min){
                min = sum;
            }
        }
        return min; 
    }
}