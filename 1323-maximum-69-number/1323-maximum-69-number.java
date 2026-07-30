class Solution {
    public int maximum69Number (int num) {
        int rev = 0;
        //first we reverse the num
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        //check that after reverse if the first number is 6 then change it into 9
        int rev1 = 0;
        int c6 = 0; // count of 6
        while(rev > 0){
            int rem = rev % 10;
            if(rem == 6 && c6 < 1){
                c6++;
                rem = 9;
            }
            rev1 = rev1 * 10 + rem;
            rev = rev / 10;
        }
        return rev1;
    }
}