import java.io.*;
import java.util.*;

public class Solution {
    static long[] countOperations(int n, int[] a, long x, int q, int[][] queries) {
        // Write your code here.
        long[] result = new long[q];
        for (int i = 0; i < q; i++) {
            int[] aCopy = Arrays.copyOf(a, n); // More efficient way to copy an array
            int k = queries[i][0];
            int y = queries[i][1];
            aCopy[k] = y;

            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += aCopy[j];
            }
            if (sum == 0) {
                result[i] = 0;
            } else if (sum <= x) {
                result[i] = 1;
            } else { // Correctly handle the case when sum > x
                long operations = 0;
                while (sum > 0) {
                    sum -= x;
                    operations++;
                }
                result[i] = operations;
            }
        }
        return result;
    }
}