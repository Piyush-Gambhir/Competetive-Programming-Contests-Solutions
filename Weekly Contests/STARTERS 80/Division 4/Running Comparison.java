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
            int N = sc.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            int bothHappy = 0;

            for (int i = 0; i < N; i++) {
                if (!(2 * A[i] < B[i]) && !(2 * B[i] < A[i])) {
                    bothHappy++;
                }
            }
            System.out.println(bothHappy);
        }
    }
}
