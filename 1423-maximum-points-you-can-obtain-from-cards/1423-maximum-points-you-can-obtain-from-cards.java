class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            sum = sum + cardPoints[i];
        }
        if(k == n){
            return sum;
        }
        max = sum;
        for(int i=k-1; i>=0; i--){
            //shrink
            sum = sum - cardPoints[i];
            //expand
            sum = sum + cardPoints[n-k+i];
            //update
            max = Math.max(max, sum);
        }
        return max;
    }
}