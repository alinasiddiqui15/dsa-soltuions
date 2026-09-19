class Solution {
    public int countSubstrings(String s) {
       int n = s.length();
       int count = 0;

       for(int i=0; i<n; i++) {
        //for odd substring
        int low = i;
        int high = i;
        while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
            count++;
        }
        String curr = s.substring(low+1, high);

        //for even substring
        low = i;
        high = i+1;
        while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
            count++;
        }
        curr = s.substring(low+1, high);
       } 
       return count;
    }
}