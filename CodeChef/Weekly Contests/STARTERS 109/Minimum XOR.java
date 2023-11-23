/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int XOR = 0;
            for (int i = 0; i < N; i++) {
                XOR = XOR ^ arr[i];
            }

            int minimumXOR = XOR;

            for (int i = 0; i < N; i++) {
                XOR = XOR ^ arr[i];
                minimumXOR = Math.min(minimumXOR, XOR);
                XOR = XOR ^ arr[i];
            }

            System.out.println(minimumXOR);
        }
    }
}