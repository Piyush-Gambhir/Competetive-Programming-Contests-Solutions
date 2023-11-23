/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (B[i] % 2 == 0) {
                    even.add(B[i]);
                } else {
                    odd.add(B[i]);
                }
            }

            if (odd.size() % 2 != 0 || even.size() % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            Collections.sort(odd);
            Collections.sort(even);

            
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
    }
}