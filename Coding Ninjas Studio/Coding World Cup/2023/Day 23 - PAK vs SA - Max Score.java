import java.util.Arrays;

public class Solution {
    static int maxSum(int[] a) {
        int n = a.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 2; i++) {
            int currSum = Math.max(a[i], a[i + 1]) + Math.min(a[i], a[i + 1]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
