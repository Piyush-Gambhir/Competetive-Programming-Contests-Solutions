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
            int K = sc.nextInt();
            String S = sc.next();

            if (K > 0 && S.charAt(0) == '0') {
                S = '1' + S.substring(1);
                K--;
            }

            S = S + "0".repeat(K);

            System.out.println(S);
        }
    }
}
