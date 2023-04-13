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
            int X = sc.nextInt();

            int[] age = new int[N];

            for (int i = 0; i < N; i++) {
                age[i] = sc.nextInt();
            }

            int count = 0;

            for (int i = 0; i < N; i++) {
                if (age[i] >= X) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
