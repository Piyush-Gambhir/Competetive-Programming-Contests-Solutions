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
            int M = sc.nextInt();

            int[] budget = new int[N];
            int[] bonus = new int[M];

            for (int i = 0; i < N; i++) {
                budget[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                bonus[i] = sc.nextInt();
            }

            int maxBonus = 0;
            int maxBonusIndex = 0;

            for (int i = 0; i < M; i++) {
                if (bonus[i] > maxBonus) {
                    maxBonus = bonus[i];
                    maxBonusIndex = i;
                }
            }

            int maxBudget = 0;
            int maxBudgetIndex = 0;

            for (int i = 0; i < N; i++) {
                if (budget[i] > maxBudget) {
                    maxBudget = budget[i];
                    maxBudgetIndex = i;
                }
            }

        }
    }
}
