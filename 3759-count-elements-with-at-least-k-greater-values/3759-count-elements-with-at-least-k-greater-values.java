class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        if(k == 0) return n;
        Arrays.sort(nums);
        int ul = n-k;
        int greater = nums[ul];
        for(int ele : nums){
            if(ele < greater){
                count++;
            }
        }
        return count;
    }
}