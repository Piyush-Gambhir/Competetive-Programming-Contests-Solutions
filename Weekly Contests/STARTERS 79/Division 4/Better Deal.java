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
            int A = sc.nextInt();
            int B = sc.nextInt();

            int firstStorePrice = 100;
            int secondStorePrice = 200;

            int firstStorePriceAfterDiscount = firstStorePrice - (int) ((A / 100.0) * firstStorePrice);
            int secondStorePriceAfterDiscount = secondStorePrice - (int) ((B / 100.0) * secondStorePrice);

            if (firstStorePriceAfterDiscount == secondStorePriceAfterDiscount) {
                System.out.println("BOTH");
            } else if (firstStorePriceAfterDiscount < secondStorePriceAfterDiscount) {
                System.out.println("FIRST");
            } else {
                System.out.println("SECOND");
            }
        }
    }
}
