/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] A = new int[n];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
                min = Math.min(min, A[i]);
                max = Math.max(max, A[i]);
            }

            int X = Math.max(min - 1, max + 1);
            if (X < 0) {
                System.out.println(-1);
            } else {
                System.out.println(X);
            }
        }
    }
}
