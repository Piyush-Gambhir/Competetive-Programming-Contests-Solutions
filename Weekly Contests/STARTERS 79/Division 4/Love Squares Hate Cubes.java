/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    private static int numberOfSquares(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            count++;
        }
        return count;
    }

    private static int numberOfCubes(int n) {
        int count = 0;
        for (int i = 1; i * i * i <= n; i++) {
            count++;
        }
        return count;
    }

    private static int F(int n) {
        return numberOfSquares(n) - numberOfCubes(n);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();

                int N = 1;
                // Optimized Time COmplexity

                

                System.out.println(N);
        }
    }
}