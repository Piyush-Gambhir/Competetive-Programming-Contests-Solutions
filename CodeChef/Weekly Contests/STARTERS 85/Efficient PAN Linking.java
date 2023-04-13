/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            BigInteger officers = BigInteger.valueOf(20);
            BigInteger[] divAndRem = n.divideAndRemainder(officers);
            BigInteger minUnprocessed = divAndRem[1];
            System.out.println(minUnprocessed);
        }
    }
}
