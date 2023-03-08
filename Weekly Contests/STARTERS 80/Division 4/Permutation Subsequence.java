/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int m = 1;
            for (int i = 0; i < N; i++) {
                if (A[i] > m) {
                    m = A[i];
                }
            }
            int[][] dp = new int[N][m + 1];
            for (int i = 0; i < N; i++) {
                dp[i][1] = 1;
            }
            for (int j = 2; j <= m; j++) {
                int[] count = new int[j + 1];
                for (int i = 0; i < N; i++) {
                    int x = A[i];
                    if (x <= j) {
                        dp[i][j] = count[x - 1];
                        count[x] = (count[x] + dp[i][j - 1]) % MOD;
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < N; i++) {
                ans = (ans + dp[i][m]) % MOD;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}