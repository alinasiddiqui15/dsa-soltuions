class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       int left = 0;
       int ans = 0;

       int n = nums.length;
       Map<Integer, Integer> map = new HashMap<>();

       for(int right = 0; right<n; right++){
        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

        while(map.get(nums[right]) > k){
            map.put(nums[left], map.get(nums[left]) - 1);
            left++;
        }
        ans = Math.max(ans, right - left + 1);
       }
       return ans;
    }
}