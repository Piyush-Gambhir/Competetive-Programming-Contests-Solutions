/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int[][] costs = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = sc.nextInt();
            }
        }
        int maxDogs = 0;
        for (int i = 0; i < 3; i++) {
            int minCost = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                if (costs[i][j] < minCost) {
                    minCost = costs[i][j];
                }
            }
            if (X >= minCost) {
                maxDogs++;
                X -= minCost;
            }
        }
        System.out.println(maxDogs);
    }
}