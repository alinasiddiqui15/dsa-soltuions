class Solution {
    public String firstPalindrome(String[] words) {
       for(String ele : words){
        int left = 0;
        int right = ele.length() - 1;

        while(left < right){
            if(ele.charAt(left) != ele.charAt(right)){
                break;
            }
            left++;
            right--;
        }
        if(left >= right){
            return ele;
        }
       } 
       return "";
    }
}