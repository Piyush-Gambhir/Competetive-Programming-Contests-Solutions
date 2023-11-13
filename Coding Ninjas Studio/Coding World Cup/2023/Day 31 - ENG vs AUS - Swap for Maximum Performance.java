public class Solution {
    static int maxSwap(int[] a) {
        int n = a.length;
        int m = a[1];

        for (int i = 1; i <= n - 2; i++)
            m = Math.max(m, a[i]);

        return Math.max(a[0] + a[n - 1], Math.max(m + a[0], m + a[n - 1]));
    }
}