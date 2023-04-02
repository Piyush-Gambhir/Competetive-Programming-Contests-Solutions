/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static boolean containsDuplicate(int[] arr, int start, int end) {
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    private static boolean hasAllSameValues(int[] arr, int start, int end) {
        int first = arr[start];
        for (int i = start + 1; i < end; i++) {
            if (arr[i] != first) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            int[] strength = new int[N];
            for (int i = 0; i < N; i++) {
                strength[i] = sc.nextInt();
            }

            for (int i = 0; i < Q; i++) {
                int L = sc.nextInt();
                int R = sc.nextInt();

                int maxStrength = Integer.MIN_VALUE;
                int maxStrengthIndex = -1;
                for (int j = L - 1; j < R; j++) {
                    if (strength[j] > maxStrength) {
                        maxStrength = strength[j];
                        maxStrengthIndex = j;
                    }
                }

                boolean containsDuplciate = containsDuplicate(strength, maxStrengthIndex + 1, R);
                boolean allSameValues = hasAllSameValues(strength, L - 1, R);

                if (containsDuplciate || allSameValues) {
                    System.out.println(maxStrength + 1);
                } else {
                    System.out.println(maxStrength);
                }
            }
        }
    }
}
