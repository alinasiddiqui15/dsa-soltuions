class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n = numbers.length;
       int low = 0;
       int high = n-1;
       int[] res = new int[2];

       while(low < high){
        if(numbers[low] + numbers[high] == target){
            res[0] = low + 1;
            res[1] = high + 1;
            return res;
        }
        else if(numbers[low] + numbers[high] > target){
            high--;
        }
        else{
            low++;
        }
       } 
       return res;
    }
}