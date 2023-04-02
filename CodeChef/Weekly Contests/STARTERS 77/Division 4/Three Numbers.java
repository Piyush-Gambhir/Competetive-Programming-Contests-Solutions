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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a + b + c;
            if (sum % 3 != 0) {
                System.out.println("-1");
                return;
            }

            int target = sum / 3;
            int operations = 0;

            if (a < target) {
                operations += target - a;
                a = target;
            }
            if (b < target) {
                operations += target - b;
                b = target;
            }
            if (c > target) {
                operations += c - target;
                c = target;
            }

            if (a != b) {
                operations += 2 * (b - a);
            }

            System.out.println(operations);
        }
    }
}
