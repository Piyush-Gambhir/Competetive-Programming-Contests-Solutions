/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Reading number of test cases

        while (t-- > 0) {
            int[] aliceRolls = new int[3];
            int[] bobRolls = new int[3];

            for (int i = 0; i < 3; i++) {
                aliceRolls[i] = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                bobRolls[i] = sc.nextInt();
            }

            Arrays.sort(aliceRolls);
            Arrays.sort(bobRolls);
            int aliceScore = Integer.parseInt("" + aliceRolls[2] + aliceRolls[1] + aliceRolls[0]);
            int bobScore = Integer.parseInt("" + bobRolls[2] + bobRolls[1] + bobRolls[0]);

            if (aliceScore > bobScore) {
                System.out.println("Alice");
            } else if (aliceScore < bobScore) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }
}
