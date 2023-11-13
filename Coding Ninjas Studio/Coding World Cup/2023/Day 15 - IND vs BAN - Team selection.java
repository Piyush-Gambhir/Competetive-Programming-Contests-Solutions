import java.util.Arrays;

public class Solution {
    static int maxDifference(int m, int[] a) {
        Arrays.sort(a);
        int minimum = 0;
        int maximum = 0;
        for (int i = 0; i < m; i++) {
            minimum += a[i];
            maximum += a[a.length - 1 - i];
        }
        return maximum - minimum;
    }
}