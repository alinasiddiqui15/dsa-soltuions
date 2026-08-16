class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        //nums1 ki elements ko set me daalo
        for(int ele : nums1){
            set.add(ele);
        }  
        //nums2 ke common elements check kro
        for(int ele : nums2){
            if(set.contains(ele)){
                ans.add(ele);
            }
        } 
        //set ko array me convert kro
        int[] arr = new int[ans.size()];
        int i = 0;

        for(int num : ans){
            arr[i] = num;
            i++;
        }
        return arr;    
    }
}