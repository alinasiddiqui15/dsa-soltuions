class Solution {
    public boolean checkFib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        while(c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }
    public boolean threeFibonacciSum(int n) {
        if(n % 2 != 0) return false;
        n = n/2;
        return checkFib(n);
    }
}