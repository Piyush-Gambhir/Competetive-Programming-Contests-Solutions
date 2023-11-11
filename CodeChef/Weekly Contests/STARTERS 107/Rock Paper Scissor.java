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
            String A = sc.next();
            String B = sc.next();

            int counter = 0;

            for (int i = 0; i < N; i++) {
                if (A.charAt(i) == B.charAt(i)) {
                    continue;
                } else if ((A.charAt(i) == 'R' && B.charAt(i) == 'S') || (A.charAt(i) == 'S' && B.charAt(i) == 'P')
                        || (A.charAt(i) == 'P' && B.charAt(i) == 'R')) {
                    counter++;
                } else {
                    counter--;
                }
            }

            if (counter > 0) {
                System.out.println(0);
            } else if (counter == 0) {
                System.out.println(1);
            } else {
                System.out.println(-counter / 2 + 1);
            }
        }
    }
}
