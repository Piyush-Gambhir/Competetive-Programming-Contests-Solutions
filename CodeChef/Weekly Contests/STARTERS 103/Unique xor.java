/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine();

            int[][] cnt = new int[k][2];
            for (int i = 0; i < n; i++) {
                cnt[i % k][s.charAt(i) - '0']++;
            }

            int res = 0;
            for (int r = 0; r < k; r++) {
                res += Math.min(cnt[r][0], cnt[r][1]);
            }

            System.out.println(res);
        }
    }
}
