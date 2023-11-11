public class Solution {
    public static long countPairs(int n, int[] a) {
        int maxVal = a[0];
        int minVal = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
            }
            if (a[i] < minVal) {
                minVal = a[i];
            }
        }

        int maxDiff = maxVal - minVal;

        long count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == maxDiff) {
                    count++;
                }
            }
        }

        return count * 2;
    }
}
