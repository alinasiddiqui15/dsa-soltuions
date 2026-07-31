class Solution {
    public int[] sortedSquares(int[] nums) {
        //Two Pointer
        int n = nums.length;
        int[] result = new int[n];

        int low = 0;
        int high = n - 1;
        int p = n - 1;

        while (low <= high) {
            int lowSquare = nums[low] * nums[low];
            int highSquare = nums[high] * nums[high];

            if (lowSquare > highSquare) {
                result[p] = lowSquare;
                low++;
            } else {
                result[p] = highSquare;
                high--;
            }

            p--;
        }

        return result;
    }
}