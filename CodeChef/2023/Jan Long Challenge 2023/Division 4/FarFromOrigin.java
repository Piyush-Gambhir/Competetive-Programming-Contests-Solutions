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
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // distance from origin of both points
            double d1 = Math.sqrt(x1 * x1 + y1 * y1);
            double d2 = Math.sqrt(x2 * x2 + y2 * y2);

            if (d1 > d2) {
                System.out.println("ALEX");
            } else if (d1 < d2) {
                System.out.println("BOB");
            } else {
                System.out.println("EQUAL");
            }
        }
    }
}
