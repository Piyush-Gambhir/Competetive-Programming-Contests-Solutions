/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static int GCD(int A, int B) {
        if (B == 0) {
            return A;
        }
        return GCD(B, A % B);
    }

    private static int LCM(int A, int B) {
        return (A * B) / GCD(A, B);
    }

    
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            
        }
    }
}
