import java.util.Arrays;

public class Solution {
    static int doubleBeauty(int k, int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int s = 0;

        for (int i = 0; i < k; i++) {
            s += a[n - 1 - i] * 2;
        }

        return s;
    }
}