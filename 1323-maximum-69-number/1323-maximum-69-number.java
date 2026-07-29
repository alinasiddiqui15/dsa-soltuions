class Solution {
    public int maximum69Number(int num) {
        int rev = 0;

        //first we reverse the given number
        while(num > 0){
            int ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }
        int rev1 = 0;
        int c6 = 0;
        //check if the last first digit is 6 or not
        while(rev > 0){ 
            int ld = rev % 10;
            if(ld == 6 && c6 < 1){ // if it is 6 then replace it with 9 (only first 6 not for every 6)
                c6++;
                ld = 9;
            }
            //again reverse the digit and get the answer
            rev1 = rev1 * 10 + ld;
            rev = rev / 10;
        }
        return rev1;
    }
}