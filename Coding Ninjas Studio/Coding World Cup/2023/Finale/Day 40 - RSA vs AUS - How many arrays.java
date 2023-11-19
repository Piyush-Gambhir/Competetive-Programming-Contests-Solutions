public class Solution {
    static int howManyArrays(int n, int[] a) {
        if (a[0] > 0 || a[n - 1] > 0) {
            return 0;
        }
        long[][] dp = new long[n][n];
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            for (int j = 0; j < n; j++) {
                dp[curr][j] = dp[prev][j];
                if (j > 0) {
                    dp[curr][j] = (dp[curr][j] + dp[prev][j - 1]) % 1000000007;
                }
                if (j + 1 < n) {
                    dp[curr][j] = (dp[curr][j] + dp[prev][j + 1]) % 1000000007;
                }
            }
            if (a[i] != -1) {
                for (int j = 0; j < n; j++) {
                    if (j != a[i]) {
                        dp[curr][j] = 0;
                    }
                }
            }
        }
        return (int) dp[n - 1][0];
    }
}