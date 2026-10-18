class Solution {
    public boolean isPrime(int n) {
            if(n <= 1) {
                return false;
            }
            for(int i=2; i<= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> li = new ArrayList<>();
        int sum = 0;

        for(int i=1; i<=n; i++) {
           if (isPrime(i)) {
            sum = sum + i;
            if(sum > s) {
                break;
            }
            else {
                li.add(i);
            }
           }
        }
        return li;
    }
}