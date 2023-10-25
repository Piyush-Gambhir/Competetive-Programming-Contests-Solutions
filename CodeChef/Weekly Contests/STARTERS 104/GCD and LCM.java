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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x == y) {
                System.out.println(x + y);
                continue;
            }

            int mini = 1000000;
            if (z > 1000) {
                z = 1000;
            }

            while (z > 0) {
                int sum = 0;
                int val = gcd(x, y);
                if (x > y) {
                    x = val;
                } else {
                    y = val;
                }
                sum += val;
                int lcm = (x * y) / val;
                if (x > y) {
                    x = lcm;
                } else {
                    y = lcm;
                }
                sum += lcm;
                mini = Math.min(mini, sum);
                z--;
            }

            System.out.println(mini);
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
