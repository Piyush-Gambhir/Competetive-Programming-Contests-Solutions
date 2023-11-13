import java.util.Arrays;

public class Solution {
    public static long baitAndSwitch(int n, int[] a, int k, int m) {
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(a[i] - m);
        }

        Arrays.sort(diff);

        long s = 0;
        for (int i = 0; i < k; i++) {
            s += diff[n - 1 - i];
        }

        return s;
    }
}