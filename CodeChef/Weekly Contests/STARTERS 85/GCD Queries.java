/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                pq.add(temp);
            }
            List<Integer> result = new ArrayList<>();

            int Q = sc.nextInt();
            for (int i = 0; i < Q; i++) {
                int X = sc.nextInt();
                int minElement = Integer.MAX_VALUE;
                PriorityQueue<Integer> pqCopy = new PriorityQueue<>(pq);
                for (int num : pqCopy) {
                    if (gcd(X, num) > 1) {
                        if (num < minElement) {
                            if (minElement != Integer.MAX_VALUE) {
                                pq.add(minElement);
                            }
                            minElement = num;
                            pq.remove(num);
                        }
                    }
                }

                if (minElement == Integer.MAX_VALUE) {
                    result.add(pq.poll());
                } else {
                    result.add(minElement);
                }
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
