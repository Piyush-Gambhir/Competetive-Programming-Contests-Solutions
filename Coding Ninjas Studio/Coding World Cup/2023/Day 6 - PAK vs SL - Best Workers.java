public class Solution {
    static long bestWorkers(int n, int k, int[] a) {
        long maxProductivity = 0;
        long currentProductivity = 0;

        for (int i = 0; i < k; i++) {
            currentProductivity += a[i];
        }
        maxProductivity = currentProductivity;

        for (int i = k; i < n; i++) {
            currentProductivity += a[i] - a[i - k];
            maxProductivity = Math.max(maxProductivity, currentProductivity);
        }

        return maxProductivity;
    }
}
