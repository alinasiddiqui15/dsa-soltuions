class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int[] copy = new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                copy[j] = nums[i];
                j++;
            }
        }
        //copy ke sare values ko nums me dalenge
        for(int i=0; i<n; i++){
            nums[i] = copy[i];
        }
    }
}