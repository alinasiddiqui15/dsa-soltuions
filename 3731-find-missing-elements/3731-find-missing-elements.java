class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> li = new ArrayList<>();

        Arrays.sort(nums);

        int j = 0;
        int max = nums[n-1];

        for(int i=nums[0]; i<=max; i++){
            if(i == nums[j]){
                j++;
            }
            else{
                li.add(i);
            }
        }
        return li;
    }
}