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
            int X = sc.nextInt();

            int chefCurrentAge = 20;
            int chefinaCurrentAge = 10;

            int ageDifference = chefCurrentAge - chefinaCurrentAge;
            int chefinaAge = X - ageDifference;

            System.out.println(chefinaAge);
        }
    }
}
