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
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (map.containsKey(A[i])) {
                    map.put(A[i], map.get(A[i]) + 1);
                } else {
                    map.put(A[i], 1);
                }
            }

            if (map.size() == N) {
                System.out.print(A[N / 2] + " " + N / 2);
                System.out.println();
                continue;
            } else {
    int minDays = Integer.MAX_VALUE;
    int minClan = Integer.MAX_VALUE;

    for (int key : map.keySet()) {
        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A[i] == key) {
                occurrences.add(i);
            }
        }

        int days = occurrences.get(0) + 1; // Days for the first segment
        days += N - occurrences.get(occurrences.size() - 1); // Days for the last segment

        // Calculating days for gaps between key occurrences
        for (int i = 1; i < occurrences.size(); i++) {
            int gap = occurrences.get(i) - occurrences.get(i - 1) - 1;
            if (gap > 1) {
                days += (gap + 1) / 2;
            }
        }

        if (days < minDays) {
            minDays = days;
            minClan = key;
        } else if (days == minDays) {
            if (key < minClan) {
                minClan = key;
            }
        }
    }
    System.out.print(minClan + " " + minDays);
    System.out.println();
}
        }
    }
}