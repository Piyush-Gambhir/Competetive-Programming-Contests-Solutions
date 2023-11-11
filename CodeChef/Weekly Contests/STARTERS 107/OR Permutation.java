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
            StringBuilder output = new StringBuilder();

            for (int i = N; i > 0; i--) {
                output.append(i).append(" ");
            }

            System.out.println(output.toString().trim());
        }
    }
}
