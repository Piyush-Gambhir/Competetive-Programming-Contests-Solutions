import java.util.Arrays;

public class Solution {
    static long gunDevil(int n, int[] a) {
        Arrays.sort(a);
        long ans = a[n - 1];
        for (int i = 0; i < n - 2; i++) {
            ans += a[i];
        }
        return ans;
    }
}