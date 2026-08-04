class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int index = 0;

        for(int ele : nums){
            int complements = target - ele;
            if(map.containsKey(complements) == true){
               res[0] = map.get(complements);
               res[1] = index; 
            }
            map.put(ele, index);
            index++;
        }
        return res;
    }
}