class Solution {
    public int maximum69Number (int num) {
       int rev = 0;

       //first we reverse the number
       while(num != 0){
        int rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
       } 

       //check if in the reverse is there any 6 number that occures first
       int rev1 = 0;
       int c6 = 0;
       while(rev != 0){
        int rem = rev % 10;
        if(rem == 6 && c6 < 1){
            rem = 9;
            c6++;
        }
        rev1 = rev1 * 10 + rem;
        rev = rev / 10;
       }
       return rev1;
    }
}