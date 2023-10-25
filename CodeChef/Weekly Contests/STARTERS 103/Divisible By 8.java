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
            String[] input = br.readLine().split(" ");
            String n = input[1];

            System.out.println(findMultiple(n));
        }
    }

    private static String findMultiple(String n) {
        BigInteger num = new BigInteger(n);
        BigInteger eight = new BigInteger("8");
        BigInteger zero = new BigInteger("0");

        for (int i = 0; i < 8; i++) {
            if (num.subtract(BigInteger.valueOf(i)).mod(eight).equals(zero))
                return num.subtract(BigInteger.valueOf(i)).toString();
        }

        for (int i = 1; i < 8; i++) {
            if (num.add(BigInteger.valueOf(i)).mod(eight).equals(zero))
                return num.add(BigInteger.valueOf(i)).toString();
        }

        return "0";
    }
}