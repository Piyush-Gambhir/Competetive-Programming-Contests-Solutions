/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine());
            if (N <= 4) {
                System.out.println(0 + " " + N);
            } else {
                System.out.println(1 + " " + (N - 1));
            }
        }
        br.close();
    }
}