class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int count = 0;
        int prod= 1;

        for(int right=0; right<n; right++){
                prod = prod * nums[right];
                while(prod >= k){
                    prod = prod / nums[left];
                    left++;
                } 
            count = count + (right-left+1);
        }
        return count;
    }
}