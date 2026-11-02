class Solution {
    public int minMergedInteger(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {

            int a = nums[i];
            int b = nums[i + 1];

            int temp = b;

            while (temp > 0) {
                a = a * 10;
                temp = temp / 10;
            }

            int merged = a + b;

            if (merged < min) {
                min = merged;
            }
        }

        return min;
    }
}