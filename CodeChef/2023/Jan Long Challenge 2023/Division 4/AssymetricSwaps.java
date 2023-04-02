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
            int[] B = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }

            int[] arr = new int[2 * n];
            for (int i = 0; i < n; i++) {
                arr[i] = A[i];
                arr[n + i] = B[i];
            }

            Arrays.sort(arr);

            int minDifference = Integer.MAX_VALUE;
            for (int i = 0; i <= n; i++) {
                minDifference = Math.min(minDifference, arr[n + i - 1] - arr[i]);
            }

            System.out.println(minDifference);
        }
    }
}
