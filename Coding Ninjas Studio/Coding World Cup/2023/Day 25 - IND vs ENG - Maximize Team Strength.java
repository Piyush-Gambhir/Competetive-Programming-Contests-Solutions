import java.util.Arrays;

public class Solution {
    public static long maximumPower(int n, int[] a) {
        Arrays.sort(a);
        long ans = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, (long) a[i - 1] * a[i]);
        }
        return ans;
    }
}