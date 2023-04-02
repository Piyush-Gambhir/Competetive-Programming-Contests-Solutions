/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {
    private static int countDistinctDigits(int number) {
        int[] digits = new int[10];
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digits[digit] == 0) {
                digits[digit] = 1;
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int X = 0;

            while (countDistinctDigits(N + X) > K) {
                X++;
            }
            System.out.println(X);
        }
    }
}
