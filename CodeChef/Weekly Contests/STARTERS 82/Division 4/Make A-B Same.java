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
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            boolean possible = true;

            for (int i = 0; i < N; i++) {
                if (B[i] == 1 && A[i] == 0) {
                    for (int index = i + 1; index < N; index++) {
                        if (A[index] == 1) {
                            possible = true;
                            break;
                        } else {
                            possible = false;
                        }
                    }
                } else if (B[i] == 0 && A[i] == 1) {
                    for (int index = i + 1; index < N; index++) {
                        if (A[index] == 0) {
                            possible = true;
                            break;
                        } else {
                            possible = false;
                        }
                    }
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
