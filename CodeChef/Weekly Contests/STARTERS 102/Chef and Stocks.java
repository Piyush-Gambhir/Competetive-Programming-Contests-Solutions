/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int[] profits = new int[N];
            int totalProfit = 0;
            int minProfit = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                profits[i] = sc.nextInt();
                totalProfit += profits[i];
                minProfit = Math.min(minProfit, profits[i]);
            }

            int maxProfitIfSkipped = totalProfit - minProfit;
            System.out.println(maxProfitIfSkipped);
        }
    }
}
