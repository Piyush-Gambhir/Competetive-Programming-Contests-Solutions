/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static int prefixSum(int[] p, int i) {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += p[j];
        }
        return sum;
    }

    private static void swap(int[] p, int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("1");
            } else if (n % 2 != 0) {
                System.out.println("-1");
            } else {
                int[] p = new int[n];
                p[0] = 1;
                int odd = 3;
                int even = 2;
                for (int j = 1; j < n; j++) {
                    if (j % 2 == 1) {
                        p[j] = odd;
                        odd += 2;
                    } else {
                        p[j] = even;
                        even += 2;
                    }
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(p[j] + " ");
                }
                System.out.println();
            }
        }
    }
}