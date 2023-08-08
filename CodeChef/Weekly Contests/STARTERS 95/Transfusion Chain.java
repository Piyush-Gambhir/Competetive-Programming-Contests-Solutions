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
            String[] B = new String[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.next();
            }
            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if (B[i].equals("A") && (!B[i + 1].equals("A") && !B[i + 1].equals("B"))) {
                    break;
                } else if (B[i].equals("B") && (!B[i + 1].equals("B") && !B[i + 1].equals("AB"))) {
                    break;

                } else if (B[i].equals("AB") && !B[i + 1].equals("AB")) {
                    break;
                } else if (B[i].equals("O")
                        && (!B[i + 1].equals("A") && !B[i + 1].equals("B") && !B[i + 1].equals("AB"))) {
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
