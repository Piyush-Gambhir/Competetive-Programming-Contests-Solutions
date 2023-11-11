import java.util.*;

public class Solution {
    static int minDifference(int[] a) {
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            minDiff = Math.min(minDiff, a[i + 1] - a[i]);
        }
        return minDiff;
    }
}
