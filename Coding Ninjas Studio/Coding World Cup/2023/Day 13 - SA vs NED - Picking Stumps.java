public class Solution {
    static int pickingThree(int n, int[] a) {
        int s = 0;
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    s += (a[i] + a[j] + a[k]) % mod;
                }
            }
        }

        return s % mod;
    }
}