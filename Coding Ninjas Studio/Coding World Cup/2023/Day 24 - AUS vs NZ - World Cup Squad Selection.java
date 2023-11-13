public class Solution {
    static long rejection(int n, int[] a, int[] b) {
        long ans = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, sum - a[i] + b[i]);
        }

        return ans;
    }
}