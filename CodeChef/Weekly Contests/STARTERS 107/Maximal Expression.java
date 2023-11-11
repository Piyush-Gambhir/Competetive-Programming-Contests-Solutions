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
            int K = sc.nextInt();

            if (N < K) {
                int X_N_2 = N / 2;
                int F_X_N_2 = (N % X_N_2) * (N - X_N_2) % K;
                int X_N_2_1 = (N + 1) / 2;
                int F_X_N_2_1 = ((N + 1) % X_N_2_1) * (N + 1 - X_N_2_1) % K;
                int X = F_X_N_2 > F_X_N_2_1 ? X_N_2 : X_N_2_1;
                System.out.println(X);
            } else {

                int N_1 = K;
                int X_N_2 = N_1 / 2;
                int F_X_N_2 = (N_1 % X_N_2) * (N_1 - X_N_2) % K;
                int X_N_2_1 = (N_1 + 1) / 2;
                int F_X_N_2_1 = ((N_1 + 1) % X_N_2_1) * (N_1 + 1 - X_N_2_1) % K;
                int X_1 = F_X_N_2 > F_X_N_2_1 ? X_N_2 : X_N_2_1;

                int N_2 = N % K + N % K;
                int X_N_2_Y = N_2 / 2;
                int F_X_N_2_Y = (N_2 % X_N_2_Y) * (N_2 - X_N_2_Y) % K;
                int X_N_2_1_Y = (N_2 + 1) / 2;
                int F_X_N_2_1_Y = ((N_2 + 1) % X_N_2_1_Y) * (N_2 + 1 - X_N_2_1_Y) % K;
                int X_2 = F_X_N_2_Y > F_X_N_2_1_Y ? X_N_2_Y : X_N_2_1_Y;
                System.out.println(Math.max(X_1, X_2));
            }

        }
    }
}
