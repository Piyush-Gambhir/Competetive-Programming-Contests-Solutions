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
            int A = sc.nextInt();
            int B = sc.nextInt();

            int duration = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0)
                    duration += A;
                else
                    duration += B;
            }
            System.out.println(duration);
        }
    }
}
