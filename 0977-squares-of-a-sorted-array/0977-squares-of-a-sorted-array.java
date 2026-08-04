class Solution {
    public int[] sortedSquares(int[] nums) {
       //Two pointer
       int n = nums.length;
       int[] res = new int[n];

       int low = 0;
       int high = n-1;
       int p = n-1;

       while(low <= high){
        int lowSquare = nums[low] * nums[low];
        int highSquare = nums[high] * nums[high];

        if(lowSquare > highSquare){
            res[p] = lowSquare;
            low++;
        } else{
            res[p] = highSquare;
            high--;
        }
        p--;
       }
       return res;
    }
}