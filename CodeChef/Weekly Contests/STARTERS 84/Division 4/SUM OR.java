/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    static final int MOD = 1000000007;

    static int countTriplets(int n) {
        int[][][] dp = new int[n][n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (i + j + k == n) {
                        if ((i | j) == k) {
                            if (i == j && j == k) {
                                dp[i][j][k] = 1;
                            } else if (i == j || j == k || i == k) {
                                dp[i][j][k] = 3;
                            } else {
                                dp[i][j][k] = 6;
                            }
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    ans += dp[i][j][k];
                    ans %= MOD;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            System.out.println(countTriplets(N));
        }
    }
}
