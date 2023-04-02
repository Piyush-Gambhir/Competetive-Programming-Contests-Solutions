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
            int speed = sc.nextInt();
            int fine = 0;

            if (speed <= 70) {
                fine = 0;
            } else if (speed <= 100 && speed > 70) {
                fine = 500;
            } else {
                fine = 2000;
            }

            System.out.println(fine);
        }
    }
}
