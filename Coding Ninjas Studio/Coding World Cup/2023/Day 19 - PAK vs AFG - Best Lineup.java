import java.util.Arrays;

public class Solution {
    static long bestLineup(int n, int[] x) {
        Arrays.sort(x);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long) (x[n - 1 - i] - i) * (x[n - 1 - i] - i);
        }

        return ans;
    }
}