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

        int[] leds = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int diff = Math.abs(x - y);
            int count = 0;

            while (diff > 0) {
                int digit = diff % 10;
                count += leds[digit];
                diff /= 10;
            }

            System.out.println(count);
        }
    }
}