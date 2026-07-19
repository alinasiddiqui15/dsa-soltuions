class Solution {
    public int countElements(int[] nums, int k) {
        //WE HAVE TO FIND THAT --> kitne element hai arr me jo k se chote hain
        int n = nums.length;
        int count = 0;
        //(n-k) se chote values will be the answer

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