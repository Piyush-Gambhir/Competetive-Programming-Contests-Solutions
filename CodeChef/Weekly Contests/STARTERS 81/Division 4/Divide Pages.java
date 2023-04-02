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

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;

            for (int i = 0; i < N; i++) {
                sum += arr[i];
            }

            if (sum % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}