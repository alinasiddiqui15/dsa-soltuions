class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int elementSum = 0;
        int digitSum = 0;

        for(int i=0; i<n; i++){
            elementSum = elementSum + nums[i];

            int num = nums[i];
            while(num != 0){
                digitSum = digitSum + num % 10;
                num = num / 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}