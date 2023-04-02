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

            if (N == 1) {
                System.out.println(0);
                break;
            }

            int min = A[0];
            for (int i = 1; i < N; i++) {
                if (A[i] < min) {
                    min = A[i];
                }
            }

            int count = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] != min) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
