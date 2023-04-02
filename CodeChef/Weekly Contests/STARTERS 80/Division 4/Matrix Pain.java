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

            int K = sc.nextInt();

            int[][] matrix = new int[N][M];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    matrix[i - 1][j - 1] = (i - 1) * M + j;
                }
            }

            for (int i = 1; i <= K; i++) {
                int Q = sc.nextInt();
                int X = sc.nextInt();
                int V = sc.nextInt();

                if (Q == 0) {
                    for (int j = 0; j < M; j++) {
                        matrix[X - 1][j] = matrix[X - 1][j] * V;
                    }
                } else if (Q == 1) {
                    for (int j = 0; j < N; j++) {
                        matrix[j][X - 1] = matrix[j][X - 1] * V;
                    }
                }
            }

            long sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {

                    sum += matrix[i][j];
                }
            }
            System.out.println(sum % 1000000007);
        }
    }
}
