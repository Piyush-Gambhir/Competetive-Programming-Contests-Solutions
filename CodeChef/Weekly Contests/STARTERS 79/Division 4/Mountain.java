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
            int M = sc.nextInt();
            int Q = sc.nextInt();

            int[] Query = new int[Q];
            for (int i = 0; i < Q; i++) {
                Query[i] = sc.nextInt();
            }

            int matrix[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = i;
                }
            }



        }
    }
}
