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
            int n = sc.nextInt();

            int[] arr = new int[2 * n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int min = Integer.MAX_VALUE;
            int operations = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
            }
            for (int i = n; i < 2 * n; i++) {
                min = Math.min(min, arr[i]);
                if (arr[i] <= max) {
                    int temp = arr[i];
                    arr[i] = arr[maxIndex];
                    arr[maxIndex] = temp;
                    operations++;
                    max = 0;
                    for (int j = 0; j < n; j++) {
                        max = Math.max(max, arr[j]);
                    }
                }
            }
            System.out.println(operations);
        }
    }
}
