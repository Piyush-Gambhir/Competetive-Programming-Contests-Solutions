
public class Solution {
    static int arrayDivisibility(int n, int[] x, int[] y) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] < y[i]) {
                int diff = Math.min(y[i] - x[i], x[i]);
                count += diff;
            } else if (x[i] % y[i] > 0) {
                int rem = x[i] % y[i];
                int div = x[i] / y[i];
                int adjust = Math.min(rem, (div * y[i]) + y[i] - x[i]);
                count += adjust;
            }
        }

        return count;
    }
}
