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
            int n = sc.nextInt();
            int[] likes = new int[n];
            int[] comments = new int[n];

            for (int i = 0; i < n; i++) {
                likes[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                comments[i] = sc.nextInt();
            }

            int mostPopularIndex = 0;

            int maxLikes = likes[0];
            int maxComments = comments[0];

            for (int i = 1; i < n; i++) {
                if (likes[i] > likes[mostPopularIndex]
                        || (likes[i] == likes[mostPopularIndex] && comments[i] > comments[mostPopularIndex])) {
                    mostPopularIndex = i;
                }
            }
            System.out.println(mostPopularIndex + 1);
        }
    }
}
