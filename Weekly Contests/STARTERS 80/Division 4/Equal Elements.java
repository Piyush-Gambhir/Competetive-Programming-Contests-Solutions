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
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }

            int max = 0;
            int maxCount = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    max = entry.getKey();
                }
            }

            System.out.println(N - maxCount);

        }
    }
}
