public class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    static int primeSum(int n, int m, int[] a) {
        // Write your code here.

        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < i + m && i + m < n; j++) {
                temp += a[j];
            }
            if (isPrime(temp)) {
                primeCount++;
            }
        }
        return primeCount;
    }
}