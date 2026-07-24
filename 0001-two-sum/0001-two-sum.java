class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int index = 0;

        for(int ele : nums){
            int complements = target - ele;
            if(map.containsKey(complements) == true){
                ans[0] = map.get(complements);
                ans[1] = index;
                return ans;
            }
            map.put(ele, index);
            index++;
        }
        return ans;
    }
}