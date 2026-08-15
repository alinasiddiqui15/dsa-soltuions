class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        // nums1 ko set mein store karo
        for(int ele : nums1){
            set1.add(ele);
        }
        // nums2 ke common elements check karo
        for(int ele : nums2){
            if(set1.contains(ele)){
                res.add(ele);
            }
        }
        //set ko array me convert krdo
        int[] arr = new int[res.size()];
        int i = 0;

        for(int num : res){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}