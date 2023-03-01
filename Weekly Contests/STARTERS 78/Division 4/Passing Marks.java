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
            int X = sc.nextInt();

            int[] marks = new int[N];

            for (int i = 0; i < N; i++) {
                marks[i] = sc.nextInt();

            }
            // Kth smallest element
            Arrays.sort(marks);

            System.out.println(marks[N - X] - 1);

        }
    }
}
